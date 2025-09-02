package com.breden.springboot.service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.xml.rpc.holders.StringHolder;

import org.springframework.stereotype.Service;

import com.breden.springboot.dto.ResponseDTO;
import com.breden.springboot.facturacion.addressing.ReferenceParametersType;
import com.breden.springboot.facturacion.addressing.ReplyToType;
import com.breden.springboot.facturacion.common.Temp_err_msg;
import com.breden.springboot.facturacion.common.TtContext;
import com.breden.springboot.facturacion.holders.WSDLQueryGetIh3SFResponseTypeHolder;
import com.breden.springboot.facturacion.services.QdocWebServiceProxy;
import com.breden.springboot.facturacion.services.QdocWebService_PortType;
import com.breden.springboot.facturacion.services.TtQueryType;
import com.breden.springboot.facturacion.services.TtidhhistResponseType;
import com.breden.springboot.facturacion.services.WSDLQueryGetIh3SFResponseType;
import com.breden.springboot.facturacion.services.WSDLQueryGetIh3SFType;
import com.breden.springboot.util.Utils;

@Service("bredenFacturacionService")
public class BredenFacturacionServiceImpl implements BredenFacturacionService {


	public ResponseDTO<String,List<TtidhhistResponseType>> facturaciones(String fecha) {
		Utils utils = new Utils();
		//utils.sendLogTransaccion(cliente.toString(), "entrada", "salesforce", "qad");
		Properties prop = utils.getProperties();
		ResponseDTO<String,List<TtidhhistResponseType>> responseDto = new ResponseDTO<String,List<TtidhhistResponseType>>();
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
    		
    		WSDLQueryGetIh3SFType body = new WSDLQueryGetIh3SFType();
    		//List<TtContext> dsSessionContext = new ArrayList<TtContext>();
    		TtContext ttContext = new TtContext();
    		ttContext.setPropertyQualifier(prop.getProperty("qad.service.qualifier"));
    		ttContext.setPropertyName(prop.getProperty("qad.service.context.name"));
    		ttContext.setPropertyValue("eB2_1");
    		
    		TtContext ttContext2 = new TtContext();
    		ttContext2.setPropertyQualifier(prop.getProperty("qad.service.qualifier"));
    		ttContext2.setPropertyName(prop.getProperty("qad.service.context2.name"));
    		ttContext2.setPropertyValue(prop.getProperty("qad.service.context2.value"));;
    		
    		//dsSessionContext.add(ttContext);
    		//dsSessionContext.add(ttContext2);
    		
    		TtContext[] ttContexts = new TtContext[2];
    		ttContexts[0]=ttContext;
    		ttContexts[1]=ttContext2;
    		
    		body.setDsSessionContext(ttContexts);
    		
    		
    		TtQueryType ttQueryType = new TtQueryType();
    		ttQueryType.setTt_domain("BREDEN");
    		Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
    		ttQueryType.setTt_fecha(date1);
    		TtQueryType[] ttQueryTypes = new TtQueryType[1];
    		ttQueryTypes[0]=ttQueryType;
    		
    		body.setDsQuery(ttQueryTypes);
    		    		
    		StringHolder relatesTo = new StringHolder();
    		WSDLQueryGetIh3SFResponseTypeHolder body2 = new WSDLQueryGetIh3SFResponseTypeHolder(); 		
    		
    		LocalDate fecha1 = LocalDate.now();
    		System.out.println("Salida desde middleware a qad"+fecha1);
			port.processQdocMessage(action, to, messageID, referenceParameters, replyTo, body, relatesTo, body2);
			LocalDate fecha2 = LocalDate.now();
			System.out.println("Regreso al middleware"+fecha2);
			
			String mensaje="";
			List<TtidhhistResponseType> result = new ArrayList<TtidhhistResponseType>();
			if(body2.value.getResult().equals("error")) {
				for(Temp_err_msg error_msg : body2.value.getDsExceptions()) {
									
					mensaje += "Campo:"+ error_msg.getTt_msg_context() + " - " + error_msg.getTt_msg_desc()+" \n";
				}
				responseDto.setCodigo("406");
				responseDto.setMensaje("Hubo un error al generar cliente");
				responseDto.setObjeto(result);
				responseDto.setResponse(mensaje);
			}else {
				
				WSDLQueryGetIh3SFResponseType reponse= body2.value;
				TtidhhistResponseType[] resultado = reponse.getDsHistoria();
				if(resultado != null) {
					for(TtidhhistResponseType producto: resultado) {
						result.add(producto);
					}
				}
				responseDto.setCodigo("200");
				responseDto.setMensaje("Consulta servicio con exito");
				responseDto.setObjeto(result);
				responseDto.setResponse(mensaje);
			}
			
			
			utils.sendLogTransaccion(responseDto.toString(), "Servicio facturacion", prop.getProperty("qad.service.address"), fecha);
			
		} catch (Exception e) {
			e.printStackTrace();
			responseDto.setCodigo("500");
			responseDto.setMensaje("Error en el servicio");
			responseDto.setObjeto(null);
			responseDto.setResponse(e.getMessage());
			utils.sendLogTransaccion(responseDto.toString(), "Servicio facturacion", prop.getProperty("qad.service.address"), fecha);
		}
		return responseDto;

	}

}
