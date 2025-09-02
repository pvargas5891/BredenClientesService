package com.breden.springboot.service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.xml.rpc.holders.StringHolder;

import org.springframework.stereotype.Service;

import com.breden.springboot.cuentacorriente.services.Tt_doctosResponseType;
import com.breden.springboot.dto.ResponseDTO;
import com.breden.springboot.cuentacorriente.addressing.ReferenceParametersType;
import com.breden.springboot.cuentacorriente.addressing.ReplyToType;
import com.breden.springboot.cuentacorriente.common.Temp_err_msg;
import com.breden.springboot.cuentacorriente.common.TtContext;

import com.breden.springboot.cuentacorriente.holders.WSDLQueryGetCxCSFResponseTypeHolder;
import com.breden.springboot.cuentacorriente.services.QdocWebServiceProxy;
import com.breden.springboot.cuentacorriente.services.QdocWebService_PortType;
import com.breden.springboot.cuentacorriente.services.TtqueryType;

import com.breden.springboot.cuentacorriente.services.WSDLQueryGetCxCSFResponseType;
import com.breden.springboot.cuentacorriente.services.WSDLQueryGetCxCSFType;

import com.breden.springboot.util.Utils;

@Service("bredenCCorrienteService")
public class BredenCCorrienteServiceImpl implements BredenCCorrienteService {

	public ResponseDTO<String, List<Tt_doctosResponseType>> corriente(String fecha) {
		Utils utils = new Utils();
		// utils.sendLogTransaccion(cliente.toString(), "entrada", "salesforce", "qad");
		Properties prop = utils.getProperties();
		ResponseDTO<String, List<Tt_doctosResponseType>> responseDto = new ResponseDTO<String, List<Tt_doctosResponseType>>();
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

			WSDLQueryGetCxCSFType body = new WSDLQueryGetCxCSFType();
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

			TtqueryType TtqueryType = new TtqueryType();
			TtqueryType.setTt_domain("BREDEN");
			Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
			TtqueryType.setTt_dia(date1);
			TtqueryType[] TtqueryTypes = new TtqueryType[1];
			TtqueryTypes[0] = TtqueryType;

			body.setDsQuery(TtqueryTypes);

			StringHolder relatesTo = new StringHolder();
			WSDLQueryGetCxCSFResponseTypeHolder body2 = new WSDLQueryGetCxCSFResponseTypeHolder();

			LocalDate fecha1 = LocalDate.now();
			System.out.println("Salida desde middleware a qad" + fecha1);
			port.processQdocMessage(action, to, messageID, referenceParameters, replyTo, body, relatesTo, body2);
			LocalDate fecha2 = LocalDate.now();
			System.out.println("Regreso al middleware" + fecha2);

			String mensaje = "";
			List<Tt_doctosResponseType> result = new ArrayList<Tt_doctosResponseType>();
			if (body2.value.getResult().equals("error")) {
				for (Temp_err_msg error_msg : body2.value.getDsExceptions()) {

					mensaje += "Campo:" + error_msg.getTt_msg_context() + " - " + error_msg.getTt_msg_desc() + " \n";
				}
				responseDto.setCodigo("406");
				responseDto.setMensaje("Hubo un error al generar cliente");
				responseDto.setObjeto(result);
				responseDto.setResponse(mensaje);
			} else {

				WSDLQueryGetCxCSFResponseType reponse = body2.value;
				Tt_doctosResponseType[] resultado = reponse.getDsOrder();
				if (resultado != null) {
					for (Tt_doctosResponseType producto : resultado) {
						result.add(producto);
					}
				}
				responseDto.setCodigo("200");
				responseDto.setMensaje("Consulta servicio con exito");
				responseDto.setObjeto(result);
				responseDto.setResponse(mensaje);
			}

			utils.sendLogTransaccion(responseDto.toString(), "Servicio facturacion",
					prop.getProperty("qad.service.address"), fecha);

		} catch (Exception e) {
			e.printStackTrace();
			responseDto.setCodigo("500");
			responseDto.setMensaje("Error en el servicio");
			responseDto.setObjeto(null);
			responseDto.setResponse(e.getMessage());
			utils.sendLogTransaccion(responseDto.toString(), "Servicio facturacion",
					prop.getProperty("qad.service.address"), fecha);
		}
		return responseDto;

	}

}
