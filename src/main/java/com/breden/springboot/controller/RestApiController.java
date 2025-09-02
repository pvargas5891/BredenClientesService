package com.breden.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.breden.springboot.cuentacorriente.services.Tt_doctosResponseType;
import com.breden.springboot.customer.webservices.CustomerResponseType;
import com.breden.springboot.dto.ResponseDTO;
import com.breden.springboot.facturacion.services.TtidhhistResponseType;
import com.breden.springboot.sellout.services.TtResponse;
import com.breden.springboot.sellout.services.TtSellOutType;
import com.breden.springboot.service.BredenCCorrienteService;
import com.breden.springboot.service.BredenFacturacionService;
import com.breden.springboot.service.BredenPagadoresService;
import com.breden.springboot.service.BredenService;
import com.breden.springboot.service.BredenServiceDetail;
import com.breden.springboot.service.BredenServiceSellout;
import com.breden.springboot.service.BredenServiceV2;
import com.breden.springboot.service.AzureServiceService;
import com.breden.springboot.vo.ClienteV1;
import com.breden.springboot.vo.Pagador;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
@Tag(name = "SalesforceController", description = "Controlador para gestionar mi entidad")
public class RestApiController {

	private AzureServiceService azureServiceService;
	private BredenService bredenService;
	private BredenPagadoresService bredenPagadoresService;
	private BredenServiceV2 bredenServiceV2;
	private BredenServiceDetail bredenServiceDetail;
	private BredenFacturacionService facturacionService;
	private BredenServiceSellout bredenServiceSellout;
	private BredenCCorrienteService bredenCCorrienteService;

	@Operation(summary = "Crear cliente V1", description = "Crea un cliente en Salesforce usando ClienteV1")
	@PostMapping(value = "/clienteV1/", produces = "application/json; charset=UTF-8")
	public ResponseDTO<String, List<CustomerResponseType>> setCliente(@RequestBody ClienteV1 cliente) {

		return bredenService.generaClienteSalesForce(cliente);

	}

	@Operation(summary = "Pagadores", description = "Servicio Salesforce orientado a clientes pagadores")
	@PostMapping(value = "/pagador/", produces = "application/json; charset=UTF-8")
	public ResponseDTO<String, List<com.breden.springboot.pagadores.services.TtResponseResponseType>> setPagador(
			@RequestBody Pagador pagador) {

		return bredenPagadoresService.pagadores(pagador);

	}

	@Operation(summary = "Crear cliente V2", description = "Crea un cliente en Salesforce usando ClienteV1 con l�gica extendida")
	@PostMapping(value = "/cliente/", produces = "application/json; charset=UTF-8")
	public ResponseDTO<String, List<com.breden.springboot.customer.webservices23.TtResponseResponseType>> setClienteV2(
			@RequestBody ClienteV1 cliente) {

		ResponseDTO<String, List<com.breden.springboot.customer.webservices23.TtResponseResponseType>> response = bredenServiceV2
				.generaClienteSalesForce(cliente);

		if (response.getCodigo().equals("200")) {
			if (cliente.getLongitud().equals("1") && cliente.getLatitud().equals("1")) {

				String mensaje = "Cliente creado con exito: Excepcion. Logistica no es valida";
				bredenServiceDetail.generaLog(response.toString(), mensaje, cliente.toStringJSON());
				response.setMensaje(mensaje);

			} else {

				ResponseDTO<String, List<com.breden.springboot.detail.webservices.TtResponseResponseType>> response2 = bredenServiceDetail
						.generaClienteDetalleSalesForce(cliente);
				if (response2.getCodigo().equals("200")) {
					response.setMensaje("Cliente generado con exito ");
				}

			}
		} else {
			response.setMensaje(response.getMensaje());
		}

		return response;
	}

	@Operation(summary = "Crear cliente con logistica", description = "Crea un cliente en Salesforce usando ClienteV1 con detalles de log�stica")
	@PostMapping(value = "/clienteLogistica/", produces = "application/json; charset=UTF-8")
	public ResponseDTO<String, List<com.breden.springboot.detail.webservices.TtResponseResponseType>> setClienteV3(
			@RequestBody ClienteV1 cliente) {

		return bredenServiceDetail.generaClienteDetalleSalesForce(cliente);

	}

	@Operation(summary = "Obtener facturacion", description = "Obtiene las facturaciones para una fecha espec�fica")
	@GetMapping(value = "/facturacion/{fecha}", produces = "application/json; charset=UTF-8")
	public ResponseDTO<String, List<TtidhhistResponseType>> facturacion(@PathVariable("fecha") String fecha) {

		return facturacionService.facturaciones(fecha);

	}

	@Operation(summary = "Recepciona Sellout", description = "Recepciona datos de sellout salesforce")
	@PostMapping(value = "/recepcionSellout/", produces = "application/json; charset=UTF-8")
	public ResponseDTO<String, List<TtResponse>> sellout(@RequestBody TtSellOutType data) {

		return bredenServiceSellout.recpecionSellout(data);

	}

	@Operation(summary = "Obtener secreto", description = "Obtiene un secreto del Key Vault")
	@GetMapping("/get-secret")
	public Map<String, String> getSecret(@RequestParam String secretName) {

		String secret = azureServiceService.getSecret(secretName);
		Map<String, String> response = new HashMap<>();
		response.put("secret", secret);
		return response;
	}

	@Operation(summary = "Obtener factura", description = "Obtiene una factura dada su codigo")
	@GetMapping(value = "/factura/{codigo}", produces = "application/json; charset=UTF-8")
	public ResponseDTO<String, String> getFactura(@PathVariable("codigo") String codigo) {

		String base64 = azureServiceService.getInvoice(codigo);
		ResponseDTO<String, String> response = new ResponseDTO<>();
		response.setCodigo("200");
		response.setMensaje("Operacion ejecutada correctamente");
		response.setObjeto(base64);
		response.setResponse(codigo);
		return response;

	}

	@GetMapping(value = "/cuentacorriente/{fecha}", produces = "application/json; charset=UTF-8")
	public ResponseDTO<String, List<Tt_doctosResponseType>> cuentacorriente(@PathVariable("fecha") String fecha) {

		return bredenCCorrienteService.corriente(fecha);

	}

	/**
	 * @return BredenService return the bredenService
	 */
	public BredenService getBredenService() {
		return bredenService;
	}

	/**
	 * @param bredenService the bredenService to set
	 */
	@Autowired
	public void setBredenService(BredenService bredenService) {
		this.bredenService = bredenService;
	}

	/**
	 * @return BredenPagadoresService return the bredenPagadoresService
	 */
	public BredenPagadoresService getBredenPagadoresService() {
		return bredenPagadoresService;
	}

	/**
	 * @param bredenPagadoresService the bredenPagadoresService to set
	 */
	@Autowired
	public void setBredenPagadoresService(BredenPagadoresService bredenPagadoresService) {
		this.bredenPagadoresService = bredenPagadoresService;
	}

	/**
	 * @return BredenServiceV2 return the bredenServiceV2
	 */
	public BredenServiceV2 getBredenServiceV2() {
		return bredenServiceV2;
	}

	/**
	 * @param bredenServiceV2 the bredenServiceV2 to set
	 */
	@Autowired
	public void setBredenServiceV2(BredenServiceV2 bredenServiceV2) {
		this.bredenServiceV2 = bredenServiceV2;
	}

	/**
	 * @return BredenServiceDetail return the bredenServiceDetail
	 */
	public BredenServiceDetail getBredenServiceDetail() {
		return bredenServiceDetail;
	}

	/**
	 * @param bredenServiceDetail the bredenServiceDetail to set
	 */
	@Autowired
	public void setBredenServiceDetail(BredenServiceDetail bredenServiceDetail) {
		this.bredenServiceDetail = bredenServiceDetail;
	}

	/**
	 * @return BredenFacturacionService return the facturacionService
	 */
	public BredenFacturacionService getFacturacionService() {
		return facturacionService;
	}

	/**
	 * @param facturacionService the facturacionService to set
	 */
	@Autowired
	public void setFacturacionService(BredenFacturacionService facturacionService) {
		this.facturacionService = facturacionService;
	}

	/**
	 * @return BredenServiceSellout return the bredenServiceSellout
	 */
	public BredenServiceSellout getBredenServiceSellout() {
		return bredenServiceSellout;
	}

	/**
	 * @param bredenServiceSellout the bredenServiceSellout to set
	 */
	@Autowired
	public void setBredenServiceSellout(BredenServiceSellout bredenServiceSellout) {
		this.bredenServiceSellout = bredenServiceSellout;
	}

	/**
	 * @return AzureServiceService return the azureServiceService
	 */
	public AzureServiceService getAzureServiceService() {
		return azureServiceService;
	}

	/**
	 * @param azureServiceService the azureServiceService to set
	 */
	@Autowired
	public void setAzureServiceService(AzureServiceService azureServiceService) {
		this.azureServiceService = azureServiceService;
	}

	/**
	 * @return BredenCCorrienteService return the bredenCCorrienteService
	 */
	public BredenCCorrienteService getBredenCCorrienteService() {
		return bredenCCorrienteService;
	}

	/**
	 * @param bredenCCorrienteService the bredenCCorrienteService to set
	 */
	@Autowired
	public void setBredenCCorrienteService(BredenCCorrienteService bredenCCorrienteService) {
		this.bredenCCorrienteService = bredenCCorrienteService;
	}

}