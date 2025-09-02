package com.breden.springboot.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.xml.rpc.holders.StringHolder;

import org.springframework.stereotype.Service;

import com.breden.springboot.customer.addressing23.ReferenceParametersType;
import com.breden.springboot.customer.addressing23.ReplyToType;
import com.breden.springboot.customer.holders23.WSDLMaintainCustomerSFResponseTypeHolder;
import com.breden.springboot.customer.schemas23.Temp_err_msg;
import com.breden.springboot.customer.schemas23.TtContext;
import com.breden.springboot.customer.webservices23.TtResponseResponseType;
import com.breden.springboot.customer.webservices23.WSDLMaintainCustomerSFResponseType;
import com.breden.springboot.customer.webservices23.WSDLMaintainCustomerSFType;
import com.breden.springboot.customer.webservices23.CustomerType;
import com.breden.springboot.customer.webservices23.QdocWebServiceProxy;
import com.breden.springboot.customer.webservices23.QdocWebService_PortType;

import com.breden.springboot.dto.ResponseDTO;
import com.breden.springboot.util.Utils;
import com.breden.springboot.vo.ClienteV1;

@Service("bredenServiceV2")
public class BredenServiceV2Impl implements BredenServiceV2 {

	public ResponseDTO<String, List<TtResponseResponseType>> generaClienteSalesForce(ClienteV1 cliente) {
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

			WSDLMaintainCustomerSFType body = new WSDLMaintainCustomerSFType();
			// List<TtContext> dsSessionContext = new ArrayList<TtContext>();
			TtContext ttContext = new TtContext();
			ttContext.setPropertyQualifier(prop.getProperty("qad.service.qualifier"));
			ttContext.setPropertyName("version");
			ttContext.setPropertyValue("eB2_1");

			TtContext ttContext2 = new TtContext();
			ttContext2.setPropertyQualifier(prop.getProperty("qad.service.qualifier"));
			ttContext2.setPropertyName("domain");
			ttContext2.setPropertyValue("breden");

			// dsSessionContext.add(ttContext);
			// dsSessionContext.add(ttContext2);

			TtContext[] ttContexts = new TtContext[2];
			ttContexts[0] = ttContext;
			ttContexts[1] = ttContext2;

			body.setDsSessionContext(ttContexts);

			CustomerType customerType = new CustomerType();
			customerType.setAdAttn((!cliente.getNombreContacto().equals("") ? cliente.getNombreContacto() : "VACIO"));// cliente.getAtencionLlamada()
			// customerType.setAdAttn2((!cliente.getTelefonoContacto().equals("")?cliente.getTelefonoContacto():"VACIO"));
			// customerType.setCmFrList(cliente.getOperadorLogistico());
			// customerType.setAdAttn("NO APLICA");//cliente.getAtencionLlamada()
			customerType.setAdAttn2("NO APLICA");
			customerType.setAdCity(cliente.getCiudad());
			customerType.setAdCounty(cliente.getComuna());
			customerType.setAdCtry("CHL");
			/*
			 * customerType.setAdDate(adDate);
			 * customerType.setAdExt(adExt);
			 * customerType.setAdExt2(adExt2);
			 * customerType.setAdFax(adFax);
			 * customerType.setAdFax2(adFax2);
			 * customerType.setAdFormat(adFormat);
			 */
			customerType.setAdGstId(cliente.getRutCuentaPrincipal());

			String direccion = cliente.getDireccion();
			String[] arrSplit = direccion.split(" ");
			String primeraDireccion = "";
			String segundaDireccion = "";
			int sumatoria = 0;
			for (int i = 0; i < arrSplit.length; i++) {
				String nuevaDireccion = arrSplit[i];
				// System.out.println("nuevaDireccion:"+nuevaDireccion);
				// System.out.println("largo:"+nuevaDireccion.length());
				sumatoria += nuevaDireccion.length();
				// System.out.println("sumatoria:"+sumatoria);
				if (sumatoria <= 34) {
					if (!primeraDireccion.equals(""))
						primeraDireccion += " ";
					primeraDireccion += nuevaDireccion;
					sumatoria += 1;
				} else {
					if (nuevaDireccion.length() > 0) {
						if (!segundaDireccion.equals(""))
							segundaDireccion += " ";
						// System.out.println("nuevaDireccion antes:"+nuevaDireccion);
						nuevaDireccion = nuevaDireccion.replace(" ", "");
						// System.out.println("nuevaDireccion2:"+nuevaDireccion);
						segundaDireccion += nuevaDireccion;
						// System.out.println("segundaDireccion:"+segundaDireccion);
					}
				}
			}

			primeraDireccion = primeraDireccion.trim();
			if (segundaDireccion.length() > 35)
				segundaDireccion = segundaDireccion.substring(0, 35);

			customerType.setAdLine2(primeraDireccion);
			customerType.setAdLine3(segundaDireccion);
			customerType.setCm_chr03(cliente.getChr03());
			/*
			 * customerType.setAdMisc1Id(adMisc1Id);
			 * customerType.setAdMisc2Id(adMisc2Id);
			 * customerType.setAdMisc3Id(adMisc3Id);
			 */
			String razonsocial = cliente.getRazonSocial();
			String[] arrSplitRazon = razonsocial.split(" ");
			String razon1 = "";
			String razon2 = "";
			sumatoria = 0;
			for (int i = 0; i < arrSplitRazon.length; i++) {
				String textoRazon = arrSplitRazon[i];
				sumatoria += textoRazon.length();
				if (sumatoria <= 28) {
					if (!razon1.equals(""))
						razon1 += " ";
					razon1 += textoRazon;
					sumatoria += 1;
				} else {
					if (!razon2.equals(""))
						razon2 += " ";
					razon2 += " " + textoRazon;
				}
			}
			customerType.setAdName(razon1);// RECORTADO
			customerType.setAdLine1(razon2);
			customerType.setAdPhone(
					(cliente.getTelefono().equals("")) ? cliente.getTelefonoContacto() : cliente.getTelefono());
			customerType.setAdPhone2(cliente.getTelefono2());
			String rutCliente = cliente.getRutCuentaPrincipal();
			String[] arrSplitRut = rutCliente.split("-");
			String inicial = arrSplitRut[0];
			if (inicial.length() == 7)
				rutCliente = "0" + rutCliente;
			System.out.println("rutCliente:" + rutCliente);
			customerType.setAdPstId("CL" + rutCliente);
			customerType.setAdState(cliente.getEstado());
			customerType.setAdTaxable(true);
			customerType.setAdTaxc("IVA");
			// customerType.setAdTaxIn(false);

			customerType.setCmArSub("");
			customerType.setCmArCc("");

			customerType.setAdTaxUsage("IVA CL");
			customerType.setAdTaxZone("ZONA CL");
			/*
			 * customerType.setAdTimezone(adTimezone);
			 * customerType.setAdTxInCity(adTxInCity);
			 * customerType.setAdZip(adZip);
			 * customerType.setBankAccounts(bankAccounts);
			 * customerType.setBankAccounts(i, _value);
			 * customerType.setBtbType(btbType);
			 */
			customerType.setCmAddr(cliente.getCodigo());
			/* customerType.setCmArCc(cmArAcct); */
			customerType.setCmArAcct(cliente.getCuenta());
			customerType.setCmBill(cliente.getCobrara());

			/*
			 * customerType.setCmArSub(cmArSub);
			 * 
			 * customerType.setCmBtbCr(cmBtbCr);
			 * customerType.setCmBtbMthd(cmBtbMthd);
			 */
			customerType.setCmClass(cliente.getCanal());
			Boolean retencion = new Boolean(cliente.getRetencionCredito());
			customerType.setCmCrHold(retencion);
			customerType.setCmCrLimit(cliente.getLimiteCredito());
			customerType.setCmCrRating(cliente.getGiro());
			/*
			 * customerType.setCmCrReview(cmCrReview);
			 * customerType.setCmCrReview(cmCrReview);
			 */
			customerType.setCmCrTerms(cliente.getTerminosPago());
			/* customerType.setCmCrUpdate(cmCrUpdate); */
			customerType.setCmCurr("CLP");
			customerType.setCmDb(cliente.getModeloAtencion());

			/*
			 * customerType.setCmDiscPct(cmDiscPct);
			 * customerType.setCmDun(cmDun);
			 * customerType.setCmFin(cmFin);
			 * customerType.setCmFixPr(cmFixPr);
			 * customerType.setCmFrList(cmFrList);
			 * customerType.setCmFrMinWt(cmFrMinWt);
			 * customerType.setCmFrTerms(cmFrTerms);
			 */
			customerType.setCmLang("LS");
			// customerType.setCmPartial(cmPartial);
			Boolean dato = new Boolean(cliente.getRequiereOC());
			customerType.setCmPoReqd(dato);
			/*
			 * customerType.setCmPrList(cmPrList);
			 * customerType.setCmPrList2(cmPrList2);
			 * customerType.setCmQad06(cmQad06);
			 */
			// Boolean inactivo = new Boolean(cliente.getInactivo());
			// customerType.setCmQadl01(inactivo);
			customerType.setCmRegion(cliente.getRegion());
			customerType.setCmResale(cliente.getMercado());
			customerType.setCmRmks(cliente.getObservacion());
			/*
			 * customerType.setCmScurr(cmScurr);
			 * customerType.setCmShipLt(cmShipLt);
			 * customerType.setCmShipvia(cmShipvia);
			 */
			// customerType.setCmSic();
			customerType.setCmSic("");
			customerType.setCmSite("BREDEN");
			// customerType.setCmSlspsn(cliente.getEjecutivaVenta());
			String[] usuarios = new String[4];
			usuarios[0] = cliente.getAliasGestor();
			usuarios[1] = cliente.getEjecutivaVenta();
			usuarios[2] = cliente.getGerenteCuenta();
			usuarios[3] = cliente.getAliasPropietario();
			// customerType.setCmSlspsn1(i, _value);
			customerType.setCmSlspsn(usuarios[0] + "," + usuarios[1] + "," + usuarios[2] + "," + usuarios[3]);

			customerType.setCmSort(cliente.getNombreCorto());
			/*
			 * customerType.setCmStmt(cmStmt);
			 * customerType.setCmStmtCyc(cmStmtCyc);
			 */
			customerType.setCmType(cliente.getTipoNegocio());
			/* customerType.setDiscListFailed(discListFailed); */
			customerType.setMultSlspsn(true);
			/*
			 * customerType.setOperation(operation);
			 * customerType.setPriceListFailed(priceListFailed);
			 */
			customerType.setCmTerritorio(cliente.getTerritorio());
			Boolean anticipo = new Boolean(cliente.getAnticipo());
			customerType.setCmAnticipo(anticipo);
			customerType.setCm_chr01(cliente.getChr01());
			customerType.setCm_chr02(cliente.getChr02());
			customerType.setCm_chr03(cliente.getChr03());
			customerType.setCm_chr04(cliente.getChr04());
			customerType.setCm_chr05(cliente.getChr05());
			CustomerType[] customerTypes = new CustomerType[1];
			customerTypes[0] = customerType;

			body.setDsCustomer(customerTypes);

			StringHolder relatesTo = new StringHolder();
			WSDLMaintainCustomerSFResponseTypeHolder body2 = new WSDLMaintainCustomerSFResponseTypeHolder();

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

				WSDLMaintainCustomerSFResponseType reponse = body2.value;
				TtResponseResponseType[] resultado = reponse.getDsResponse();
				if (resultado != null) {
					for (TtResponseResponseType producto : resultado) {
						result.add(producto);
					}
				}
				responseDto.setCodigo("200");
				responseDto.setMensaje("Cliente generado con exito");
				responseDto.setObjeto(result);
				responseDto.setResponse(mensaje);
			}

			utils.sendLogTransaccion(responseDto.toString(), "Creacion Cliente",
					prop.getProperty("qad.service.address"), cliente.toStringJSON());

		} catch (Exception e) {
			e.printStackTrace();
			responseDto.setCodigo("500");
			responseDto.setMensaje("Error en el servicio");
			responseDto.setObjeto(null);
			responseDto.setResponse(e.getMessage());
			utils.sendLogTransaccion(responseDto.toString(), "Creacion Cliente",
					prop.getProperty("qad.service.address"), cliente.toStringJSON());
		}
		return responseDto;

	}

}
