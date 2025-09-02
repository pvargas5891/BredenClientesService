package com.breden.springboot.service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.xml.rpc.holders.StringHolder;

import org.springframework.stereotype.Service;

import com.breden.springboot.dto.ResponseDTO;
import com.breden.springboot.pagadores.addressing.ReferenceParametersType;
import com.breden.springboot.pagadores.addressing.ReplyToType;
import com.breden.springboot.pagadores.common.Temp_err_msg;
import com.breden.springboot.pagadores.common.TtContext;
import com.breden.springboot.pagadores.holders.WSDLSFRUTPagadoresResponseTypeHolder;
import com.breden.springboot.pagadores.services.QdocWebServiceProxy;
import com.breden.springboot.pagadores.services.QdocWebService_PortType;
import com.breden.springboot.pagadores.services.TtClientesType;
import com.breden.springboot.pagadores.services.WSDLSFRUTPagadoresResponseType;
import com.breden.springboot.pagadores.services.WSDLSFRUTPagadoresType;
import com.breden.springboot.pagadores.services.TtResponseResponseType;
import com.breden.springboot.util.Utils;
import com.breden.springboot.vo.Pagador;

@Service("bredenPagadoresService")
public class BredenPagadoresServiceImpl implements BredenPagadoresService {

	public ResponseDTO<String, List<TtResponseResponseType>> pagadores(Pagador pagador) {
		Utils utils = new Utils();
		// utils.sendLogTransaccion(cliente.toString(), "entrada", "salesforce", "qad");
		Properties prop = utils.getProperties();
		ResponseDTO<String, List<TtResponseResponseType>> responseDto = new ResponseDTO<String, List<TtResponseResponseType>>();
		QdocWebServiceProxy service = new QdocWebServiceProxy(prop.getProperty("qad.service.endpoint"));
		try {
			QdocWebService_PortType port = service.getQdocWebService_PortType();
			StringHolder action = new StringHolder();
			action.value = prop.getProperty("qad.service.action");
			StringHolder to = new StringHolder();
			to.value = prop.getProperty("qad.service.to");
			StringHolder messageID = new StringHolder();

			ReferenceParametersType referenceParameters = new ReferenceParametersType();
			referenceParameters.setSuppressResponseDetail(false);

			ReplyToType replyTo = new ReplyToType();
			replyTo.setAddress(prop.getProperty("qad.service.address"));

			WSDLSFRUTPagadoresType body = new WSDLSFRUTPagadoresType();
			// List<TtContext> dsSessionContext = new ArrayList<TtContext>();
			TtContext ttContext = new TtContext();
			ttContext.setPropertyQualifier(prop.getProperty("qad.service.qualifier"));
			ttContext.setPropertyName(prop.getProperty("qad.service.context.name"));
			ttContext.setPropertyValue("eB2_1");

			TtContext ttContext2 = new TtContext();
			ttContext2.setPropertyQualifier(prop.getProperty("qad.service.qualifier"));
			ttContext2.setPropertyName(prop.getProperty("qad.service.context2.name"));
			ttContext2.setPropertyValue(prop.getProperty("qad.service.context2.value"));
			;

			// dsSessionContext.add(ttContext);
			// dsSessionContext.add(ttContext2);

			TtContext[] ttContexts = new TtContext[2];
			ttContexts[0] = ttContext;
			ttContexts[1] = ttContext2;

			body.setDsSessionContext(ttContexts);

			TtClientesType ttQueryType = new TtClientesType();
			ttQueryType.setTtDominio(pagador.getDominio());
			ttQueryType.setTtCodCliente(pagador.getCodigo());
			ttQueryType.setTtRutPagador(pagador.getRutPagador());
			ttQueryType.setTtNombrePagador(pagador.getNombrePagador());
			ttQueryType.setTtTelefono(pagador.getTelefono());
			ttQueryType.setTtCorreo(pagador.getCorreo());
			ttQueryType.setTtUserChar01(pagador.getChr01());
			ttQueryType.setTtUserChar02(pagador.getChr02());
			ttQueryType.setTtUserChar03(pagador.getChr03());
			ttQueryType.setTtUserChar04(pagador.getChr04());
			ttQueryType.setTtUserChar05(pagador.getChr05());
			ttQueryType.setTtUserDec01(new BigDecimal(pagador.getDec01()));
			ttQueryType.setTtUserDec02(new BigDecimal(pagador.getDec02()));
			ttQueryType.setTtUserDec03(new BigDecimal(pagador.getDec03()));
			ttQueryType.setTtUserDec04(new BigDecimal(pagador.getDec04()));
			ttQueryType.setTtUserDec05(new BigDecimal(pagador.getDec05()));
			ttQueryType.setTtUserLog01(Boolean.parseBoolean(pagador.getLog01()));
			ttQueryType.setTtUserLog02(Boolean.parseBoolean(pagador.getLog02()));
			ttQueryType.setTtUserLog03(Boolean.parseBoolean(pagador.getLog03()));
			TtClientesType[] ttQueryTypes = new TtClientesType[1];
			ttQueryTypes[0] = ttQueryType;

			body.setDsClientes(ttQueryTypes);

			StringHolder relatesTo = new StringHolder();
			WSDLSFRUTPagadoresResponseTypeHolder body2 = new WSDLSFRUTPagadoresResponseTypeHolder();

			LocalDate fecha1 = LocalDate.now();
			System.out.println("Salida desde middleware a qad" + fecha1);
			port.processQdocMessage(action, to, messageID, referenceParameters, replyTo, body, relatesTo, body2);
			LocalDate fecha2 = LocalDate.now();
			System.out.println("Regreso al middleware" + fecha2);

			String mensaje = "";
			List<TtResponseResponseType> result = new ArrayList<TtResponseResponseType>();
			if (body2.value.getResult().equals("error")) {
				for (Temp_err_msg error_msg : body2.value.getDsExceptions()) {

					mensaje += "Campo:" + error_msg.getTt_msg_context() + " - " + error_msg.getTt_msg_desc() + " \n";
				}
				responseDto.setCodigo("406");
				responseDto.setMensaje("Hubo un error al generar cliente");
				responseDto.setObjeto(result);
				responseDto.setResponse(mensaje);
			} else {

				WSDLSFRUTPagadoresResponseType reponse = body2.value;
				TtResponseResponseType[] resultado = reponse.getDsResponse();
				if (resultado != null) {
					for (TtResponseResponseType producto : resultado) {
						result.add(producto);
					}
				}
				responseDto.setCodigo("200");
				responseDto.setMensaje("Consulta servicio con exito");
				responseDto.setObjeto(result);
				responseDto.setResponse(mensaje);
			}

		} catch (Exception e) {
			e.printStackTrace();
			responseDto.setCodigo("500");
			responseDto.setMensaje("Error en el servicio");
			responseDto.setObjeto(null);
			responseDto.setResponse(e.getMessage());
		}
		return responseDto;

	}

}
