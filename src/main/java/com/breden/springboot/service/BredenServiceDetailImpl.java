package com.breden.springboot.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.xml.rpc.holders.StringHolder;

import org.springframework.stereotype.Service;

import com.breden.springboot.detail.addressing.ReferenceParametersType;
import com.breden.springboot.detail.addressing.ReplyToType;
import com.breden.springboot.detail.holders.WSDLClienteAdicSFResponseTypeHolder;
import com.breden.springboot.detail.schemas.Temp_err_msg;
import com.breden.springboot.detail.schemas.TtContext;
import com.breden.springboot.detail.webservices.QdocWebServiceProxy;
import com.breden.springboot.detail.webservices.QdocWebService_PortType;
import com.breden.springboot.detail.webservices.TtResponseResponseType;
import com.breden.springboot.detail.webservices.Tt_customerType;
import com.breden.springboot.detail.webservices.WSDLClienteAdicSFResponseType;
import com.breden.springboot.detail.webservices.WSDLClienteAdicSFType;
import com.breden.springboot.dto.ResponseDTO;
import com.breden.springboot.util.Utils;
import com.breden.springboot.vo.ClienteV1;

@Service("bredenServiceDetail")
public class BredenServiceDetailImpl implements BredenServiceDetail {


	public ResponseDTO<String,List<TtResponseResponseType>> generaClienteDetalleSalesForce(ClienteV1 cliente) {
		Utils utils = new Utils();

		Properties prop = utils.getProperties();
		ResponseDTO<String,List<TtResponseResponseType>> responseDto = new ResponseDTO<String,List<TtResponseResponseType>>();
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
    		
    		WSDLClienteAdicSFType body = new WSDLClienteAdicSFType();
    		//List<TtContext> dsSessionContext = new ArrayList<TtContext>();
    		TtContext ttContext = new TtContext();
    		ttContext.setPropertyQualifier(prop.getProperty("qad.service.qualifier"));
    		ttContext.setPropertyName(prop.getProperty("qad.service.context.name"));
    		ttContext.setPropertyValue(prop.getProperty("qad.service.context1.value"));
    		
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
    		
    		Tt_customerType dsCustomerAdic = new Tt_customerType();
    		dsCustomerAdic.setTtApertura(cliente.getApertura());
    		dsCustomerAdic.setTtApertura2(cliente.getApertura2());
    		Boolean inactivo = new Boolean(cliente.getInactivo());
    		dsCustomerAdic.setTtBloqueado(inactivo);
    		String calendario = this.calendario(cliente);
    		dsCustomerAdic.setTtCalendario(calendario);
    		dsCustomerAdic.setTtCierre(cliente.getCierre());
    		dsCustomerAdic.setTtCierre2(cliente.getCierre2());
    		dsCustomerAdic.setTtComodato(cliente.getContratoComodato());
    		dsCustomerAdic.setTtcustomer(cliente.getCodigo());
    		dsCustomerAdic.setTtdomain("BREDEN");
    		BigDecimal dato = new BigDecimal(cliente.getLatitud());
    		dsCustomerAdic.setTtlatitud(dato);
    		BigDecimal dato2 = new BigDecimal(cliente.getLongitud());
    		dsCustomerAdic.setTtlongitud(dato2);
    		BigDecimal dato3 = new BigDecimal(cliente.getMontoMinimo());
    		dsCustomerAdic.setTtMontoMinimoVenta(dato3);
    		dsCustomerAdic.setTtPrioridad(5);
    		dsCustomerAdic.setTtRuta(cliente.getRuta());
    				
    		
    		Tt_customerType[] customerTypes = new Tt_customerType[1];
    		customerTypes[0]=dsCustomerAdic;
    		
    		body.setDsCustomerAdic(customerTypes);
    		    		
    		StringHolder relatesTo = new StringHolder();
    		WSDLClienteAdicSFResponseTypeHolder body2 = new WSDLClienteAdicSFResponseTypeHolder(); 		
    		LocalDate fecha1 = LocalDate.now();
    		System.out.println("Salida desde middleware a qad"+fecha1);
			port.processQdocMessage(action, to, messageID, referenceParameters, replyTo, body, relatesTo, body2);
			LocalDate fecha2 = LocalDate.now();
			System.out.println("Regreso al middleware"+fecha2);
			
			String mensaje="";
			List<TtResponseResponseType> result = new ArrayList<TtResponseResponseType>();
			if(body2.value.getResult().equals("error")) {
				for(Temp_err_msg error_msg : body2.value.getDsExceptions()) {
									
					mensaje += "Campo:"+ error_msg.getTt_msg_context() + " - " + error_msg.getTt_msg_desc()+" \n";
				}
				responseDto.setCodigo("406");
				responseDto.setMensaje("Hubo un error al generar cliente:"+mensaje);
				responseDto.setObjeto(result);
				responseDto.setResponse(mensaje);
			}else {
				
				WSDLClienteAdicSFResponseType reponse= body2.value;
				TtResponseResponseType[] resultado = reponse.getDsResponse();
				if(resultado != null) {
					for(TtResponseResponseType producto: resultado) {
						result.add(producto);
					}
				}
				responseDto.setCodigo("200");
				responseDto.setMensaje("Cliente Logistica con exito");
				responseDto.setObjeto(result);
				responseDto.setResponse(mensaje);
			}
			
			
			utils.sendLogTransaccion(responseDto.toString(), "Creacion Logistica Cliente", prop.getProperty("qad.service.address"), cliente.toStringJSON());
			
		} catch (Exception e) {
			e.printStackTrace();
			responseDto.setCodigo("500");
			responseDto.setMensaje("Error en el servicio:"+e.getMessage());
			responseDto.setObjeto(null);
			responseDto.setResponse(e.getMessage());
			utils.sendLogTransaccion(responseDto.toString(), "Creacion Logistica Cliente", prop.getProperty("qad.service.address"), cliente.toStringJSON());
		}
		return responseDto;

	}
	public void generaLog(String responseDto,String mensaje, String cliente) {
		
		Utils utils = new Utils();
		Properties prop = utils.getProperties();		
		utils.sendLogTransaccion(responseDto, "Creacion Logistica Cliente", prop.getProperty("qad.service.address"), cliente);
		
	}
	public String calendario(ClienteV1 cliente) {
		String calendario="OCASION";
		Boolean lunes = new Boolean(cliente.getLunes());
		Boolean martes = new Boolean(cliente.getMartes());
		Boolean miercoles = new Boolean(cliente.getMiercoles());
		Boolean jueves = new Boolean(cliente.getJueves());
		Boolean viernes = new Boolean(cliente.getViernes());
		Boolean sabado = new Boolean(cliente.getSabado());
		
		if(lunes && !martes && !miercoles && !jueves && !viernes && !sabado) {
			calendario="LUNES";
			//return calendario;
		}
		
		if(!lunes && martes && !miercoles && !jueves && !viernes && !sabado) {
			calendario="MARTES";
			//return calendario;
		}
		if(!lunes && !martes && miercoles && !jueves && !viernes && !sabado) {
			calendario="MIERCOLE";
			//return calendario;
		}
		if(!lunes && !martes && !miercoles && jueves && !viernes && !sabado) {
			calendario="JUEVES";
			//return calendario;
		}
		if(!lunes && !martes && !miercoles && !jueves && viernes && !sabado) {
			calendario="VIERNES";
			//return calendario;
		}
		if(!lunes && !martes && !miercoles && !jueves && !viernes && sabado) {
			calendario="SABADO";
			//return calendario;
		}
		if(!lunes && !martes && !miercoles && jueves && !viernes && sabado) {
			calendario="JUSA";
			//return calendario;
		}
		if(!lunes && !martes && !miercoles && jueves && viernes && !sabado) {
			calendario="JUVI";
			//return calendario;
		}
		if(lunes && martes && !miercoles && jueves && viernes && sabado) {
			calendario="LMJVS";
			//return calendario;
		}
		if(lunes && martes && miercoles && jueves && !viernes && sabado) {
			calendario="LMMIJS";
			//return calendario;
		}
		if(lunes && martes && miercoles && jueves && viernes && !sabado) {
			calendario="LMMIJV";
			//return calendario;
		}
		if(lunes && martes && miercoles && jueves && viernes && sabado) {
			calendario="LMMIJVS";
			//return calendario;
		}
		if(lunes && martes && miercoles && !jueves && viernes && sabado) {
			calendario="LMMIVS";
			//return calendario;
		}
		if(lunes && !martes && !miercoles && jueves && !viernes && !sabado) {
			calendario="LUJU";
			//return calendario;
		}
		if(lunes && !martes && !miercoles && jueves && !viernes && sabado) {
			calendario="LUJUSA";
			//return calendario;
		}
		if(lunes && martes && !miercoles && !jueves && !viernes && !sabado) {
			calendario="LUMA";
			//return calendario;
		}
		if(lunes && martes && !miercoles && jueves && !viernes && sabado) {
			calendario="LUMAJUSA";
			//return calendario;
		}
		if(lunes && martes && !miercoles && jueves && viernes && !sabado) {
			calendario="LUMAJUVI";
			//return calendario;
		}
		if(lunes && !martes && miercoles && !jueves && !viernes && !sabado) {
			calendario="LUMI";
			//return calendario;
		}
		if(lunes && !martes && miercoles && jueves && viernes && !sabado) {
			calendario="LuMiJuVi";
			//return calendario;
		}
		if(lunes && !martes && miercoles && !jueves && !viernes && sabado) {
			calendario="LUMISA";
			//return calendario;
		}
		if(lunes && !martes && miercoles && !jueves && viernes && !sabado) {
			calendario="LuMiVi";
			//return calendario;
		}
		if(lunes && !martes && miercoles && !jueves && viernes && sabado) {
			calendario="LUMIVISA";
			//return calendario;
		}
		if(lunes && !martes && !miercoles && !jueves && viernes && !sabado) {
			calendario="LUVI";
			//return calendario;
		}
		if(!lunes && martes && !miercoles && jueves && !viernes && !sabado) {
			calendario="MAJU";
			//return calendario;
		}
		if(!lunes && martes && !miercoles && jueves && !viernes && sabado) {
			calendario="MAJUSA";
			//return calendario;
		}
		if(!lunes && martes && !miercoles && jueves && viernes && !sabado) {
			calendario="MAJUVI";
			//return calendario;
		}
		if(!lunes && martes && miercoles && !jueves && viernes && sabado) {
			calendario="MAMIVISA";
			//return calendario;
		}
		if(!lunes && martes && !miercoles && !jueves && !viernes && sabado) {
			calendario="MASA";
			//return calendario;
		}
		if(!lunes && martes && !miercoles && !jueves && viernes && !sabado) {
			calendario="MAVI";
			//return calendario;
		}
		if(!lunes && !martes && miercoles && !jueves && !viernes && sabado) {
			calendario="MISA";
			//return calendario;
		}
		if(!lunes && !martes && miercoles && !jueves && viernes && !sabado) {
			calendario="MIVI";
			//return calendario;
		}
		if(!lunes && martes && miercoles && jueves && viernes && sabado) {
			calendario="MMIJVS";
			//return calendario;
		}
		if(!lunes && !martes && !miercoles && !jueves && !viernes && !sabado) {
			calendario="OCASION";
			//return calendario;
		}
	
		return calendario;
	}
}
