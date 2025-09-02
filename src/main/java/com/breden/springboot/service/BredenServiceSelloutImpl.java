package com.breden.springboot.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.xml.rpc.holders.StringHolder;

import org.springframework.stereotype.Service;

import com.breden.springboot.dto.ResponseDTO;
import com.breden.springboot.sellout.addressing.ReferenceParametersType;
import com.breden.springboot.sellout.addressing.ReplyToType;
import com.breden.springboot.sellout.common.Temp_err_msg;
import com.breden.springboot.sellout.common.TtContext;
import com.breden.springboot.sellout.holders.WSDLSFSellOutResponseTypeHolder;
import com.breden.springboot.sellout.services.QdocWebServiceProxy;
import com.breden.springboot.sellout.services.QdocWebService_PortType;
import com.breden.springboot.sellout.services.TtResponse;
import com.breden.springboot.sellout.services.TtSellOutType;
import com.breden.springboot.sellout.services.WSDLSFSellOutResponseType;
import com.breden.springboot.sellout.services.WSDLSFSellOutType;
import com.breden.springboot.util.Utils;



@Service("bredenServiceSellout")
public class BredenServiceSelloutImpl implements BredenServiceSellout {


	public ResponseDTO<String,List<TtResponse>> recpecionSellout(TtSellOutType data) {
		Utils utils = new Utils();
		System.out.println(data.toString());
		Properties prop = utils.getProperties();
		ResponseDTO<String,List<TtResponse>> responseDto = new ResponseDTO<>();
		QdocWebServiceProxy service = new QdocWebServiceProxy(prop.getProperty("qad.service.endpoint"));
		try {
			QdocWebService_PortType port = service.getQdocWebService_PortType();
			StringHolder action = new StringHolder();
			action.value = prop.getProperty("qad.service.action");
			StringHolder to = new StringHolder();			
			to.value = "SALESFORCE";
    		StringHolder messageID = new StringHolder();
    		messageID.value = "SALESFORCE";
    		ReferenceParametersType referenceParameters = new ReferenceParametersType(); 
    		referenceParameters.setSuppressResponseDetail(false);
    		
    		ReplyToType replyTo = new ReplyToType();
    		replyTo.setAddress(prop.getProperty("qad.service.address"));
    		
    		WSDLSFSellOutType body = new WSDLSFSellOutType();
    		//List<TtContext> dsSessionContext = new ArrayList<TtContext>();
    		TtContext ttContext = new TtContext();
    		ttContext.setPropertyQualifier(prop.getProperty("qad.service.qualifier"));
    		ttContext.setPropertyName(prop.getProperty("qad.service.context.name"));
    		ttContext.setPropertyValue("-eB2_1");
    		
    		TtContext ttContext2 = new TtContext();
    		ttContext2.setPropertyQualifier(prop.getProperty("qad.service.qualifier"));
    		ttContext2.setPropertyName("mnemonicsRaw");
    		ttContext2.setPropertyValue("false");
    		
    		//dsSessionContext.add(ttContext);
    		//dsSessionContext.add(ttContext2);
    		
    		TtContext[] ttContexts = new TtContext[2];
    		ttContexts[0]=ttContext;
    		ttContexts[1]=ttContext2;
    		
    		body.setDsSessionContext(ttContexts); 	
    				
    		
    		TtSellOutType[] customerTypes = new TtSellOutType[1];
    		customerTypes[0]=data;
    		
    		body.setDsOrder(customerTypes);
    		    		
    		StringHolder relatesTo = new StringHolder();
    		 WSDLSFSellOutResponseTypeHolder body2 = new  WSDLSFSellOutResponseTypeHolder(); 		
    		LocalDate fecha1 = LocalDate.now();
    		System.out.println("Salida desde middleware a qad"+fecha1);
			port.processQdocMessage(action, to, messageID, referenceParameters, replyTo, body, relatesTo, body2);
			LocalDate fecha2 = LocalDate.now();
			System.out.println("Regreso al middleware"+fecha2);
			
			String mensaje="";
			List<TtResponse> result = new ArrayList<>();
			if(body2.value.getResult().equals("error")) {
				for(Temp_err_msg error_msg : body2.value.getDsExceptions()) {
									
					mensaje += "Campo:"+ error_msg.getTt_msg_context() + " - " + error_msg.getTt_msg_desc()+" \n";
				}
				responseDto.setCodigo("406");
				responseDto.setMensaje("Hubo un error al consultar al cliente:");
				responseDto.setObjeto(result);
				responseDto.setResponse(mensaje);
			}else {
				
				WSDLSFSellOutResponseType reponse= body2.value;				
				TtResponse[] resultado = reponse.getDsResponse();
				if (resultado != null) {
					for (TtResponse producto : resultado) {
						result.add(producto);
					}
				}				
				responseDto.setCodigo("200");
				responseDto.setMensaje("Recepcion con exito Sellout");
				responseDto.setObjeto(result);
				responseDto.setResponse(mensaje);
			}		
			
		} catch (Exception e) {
			e.printStackTrace();
			responseDto.setCodigo("500");
			responseDto.setMensaje("Error en el servicio:"+e.getMessage());
			responseDto.setObjeto(null);
			responseDto.setResponse(e.getMessage());
			
		}
		return responseDto;

	}
	
}
