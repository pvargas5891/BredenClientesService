package com.breden.springboot.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class ClienteV1 implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String codigo;
	private String nombreCorto;
	private String razonSocial;
	private String direccion;
	private String ciudad;
	private String estado;
	private String pais;
	private String comuna;
	private String region;
	private String canal;
	private String tipoNegocio;
	private String mercado;
	private String atencionLlamada;
	private String aliasGestor;
	private String ejecutivaVenta;
	private String gerenteCuenta;
	private String aliasPropietario;
	private String telefono;
	private String telefono2;
	private String observacion;
	private String giro;
	private String terminosPago;
	private BigDecimal limiteCredito;
	private String rutCuentaPrincipal;
	private String cuenta;
	private String cobrara;
	private String modeloAtencion;
	private String requiereOC;
	private String retencionCredito;
	private String inactivo;
	private String nombreContacto;
	private String telefonoContacto;
	private String lunes;
	private String martes;
	private String miercoles;
	private String jueves;
	private String viernes;
	private String sabado;
	
	private String ruta;
	private String montoMinimo;
	private String latitud;
	private String longitud;	
	private String apertura;
	private String cierre;
	private String apertura2;	
	private String cierre2;
	private String contratoComodato;
	private String operadorLogistico;
	private String territorio;
	private String anticipo;
	private String chr01;
	private String chr02;
	private String chr03;
	private String chr04;
	private String chr05;
	
	
	public String getTerritorio() {
		return territorio;
	}
	public void setTerritorio(String territorio) {
		this.territorio = territorio;
	}
	public String getAnticipo() {
		return anticipo;
	}
	public void setAnticipo(String anticipo) {
		this.anticipo = anticipo;
	}
	public String getChr01() {
		return chr01;
	}
	public void setChr01(String chr01) {
		this.chr01 = chr01;
	}
	public String getChr02() {
		return chr02;
	}
	public void setChr02(String chr02) {
		this.chr02 = chr02;
	}
	public String getChr03() {
		return chr03;
	}
	public void setChr03(String chr03) {
		this.chr03 = chr03;
	}
	public String getChr04() {
		return chr04;
	}
	public void setChr04(String chr04) {
		this.chr04 = chr04;
	}
	public String getChr05() {
		return chr05;
	}
	public void setChr05(String chr05) {
		this.chr05 = chr05;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombreCorto() {
		return nombreCorto;
	}
	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCanal() {
		return canal;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	public String getTipoNegocio() {
		return tipoNegocio;
	}
	public void setTipoNegocio(String tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}
	public String getMercado() {
		return mercado;
	}
	public void setMercado(String mercado) {
		this.mercado = mercado;
	}
	public String getAtencionLlamada() {
		return atencionLlamada;
	}
	public void setAtencionLlamada(String atencionLlamada) {
		this.atencionLlamada = atencionLlamada;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTelefono2() {
		return telefono2;
	}
	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getGiro() {
		return giro;
	}
	public void setGiro(String giro) {
		this.giro = giro;
	}
	public String getTerminosPago() {
		return terminosPago;
	}
	public void setTerminosPago(String terminosPago) {
		this.terminosPago = terminosPago;
	}
	public BigDecimal getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(BigDecimal limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	public String getRutCuentaPrincipal() {
		return rutCuentaPrincipal;
	}
	public void setRutCuentaPrincipal(String rutCuentaPrincipal) {
		this.rutCuentaPrincipal = rutCuentaPrincipal;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	public String getCobrara() {
		return cobrara;
	}
	public void setCobrara(String cobrara) {
		this.cobrara = cobrara;
	}
	public String getAliasGestor() {
		return aliasGestor;
	}
	public void setAliasGestor(String aliasGestor) {
		this.aliasGestor = aliasGestor;
	}
	public String getEjecutivaVenta() {
		return ejecutivaVenta;
	}
	public void setEjecutivaVenta(String ejecutivaVenta) {
		this.ejecutivaVenta = ejecutivaVenta;
	}
	public String getGerenteCuenta() {
		return gerenteCuenta;
	}
	public void setGerenteCuenta(String gerenteCuenta) {
		this.gerenteCuenta = gerenteCuenta;
	}
	public String getAliasPropietario() {
		return aliasPropietario;
	}
	public void setAliasPropietario(String aliasPropietario) {
		this.aliasPropietario = aliasPropietario;
	}
	public String getModeloAtencion() {
		return modeloAtencion;
	}
	public void setModeloAtencion(String modeloAtencion) {
		this.modeloAtencion = modeloAtencion;
	}
	public String getRequiereOC() {
		return requiereOC;
	}
	public void setRequiereOC(String requiereOC) {
		this.requiereOC = requiereOC;
	}
	
	public String getInactivo() {
		return inactivo;
	}
	public void setInactivo(String inactivo) {
		this.inactivo = inactivo;
	}

	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	public String getMontoMinimo() {
		return montoMinimo;
	}
	public void setMontoMinimo(String montoMinimo) {
		this.montoMinimo = montoMinimo;
	}
	public String getLatitud() {
		return latitud;
	}
	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}
	public String getLongitud() {
		return longitud;
	}
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	public String getApertura() {
		return apertura;
	}
	public void setApertura(String apertura) {
		this.apertura = apertura;
	}
	public String getCierre() {
		return cierre;
	}
	public void setCierre(String cierre) {
		this.cierre = cierre;
	}
	public String getApertura2() {
		return apertura2;
	}
	public void setApertura2(String apertura2) {
		this.apertura2 = apertura2;
	}
	public String getCierre2() {
		return cierre2;
	}
	public void setCierre2(String cierre2) {
		this.cierre2 = cierre2;
	}
	public String getContratoComodato() {
		return contratoComodato;
	}
	public void setContratoComodato(String contratoComodato) {
		this.contratoComodato = contratoComodato;
	}
	public String getLunes() {
		return lunes;
	}
	public void setLunes(String lunes) {
		this.lunes = lunes;
	}
	public String getMartes() {
		return martes;
	}
	public void setMartes(String martes) {
		this.martes = martes;
	}
	public String getMiercoles() {
		return miercoles;
	}
	public void setMiercoles(String miercoles) {
		this.miercoles = miercoles;
	}
	public String getJueves() {
		return jueves;
	}
	public void setJueves(String jueves) {
		this.jueves = jueves;
	}
	public String getViernes() {
		return viernes;
	}
	public void setViernes(String viernes) {
		this.viernes = viernes;
	}
	public String getSabado() {
		return sabado;
	}
	public void setSabado(String sabado) {
		this.sabado = sabado;
	}
	
	public String getOperadorLogistico() {
		return operadorLogistico;
	}
	public void setOperadorLogistico(String operadorLogistico) {
		this.operadorLogistico = operadorLogistico;
	}
	
	public String getNombreContacto() {
		return nombreContacto;
	}
	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}
	public String getTelefonoContacto() {
		return telefonoContacto;
	}
	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}
	
	public String getRetencionCredito() {
		return retencionCredito;
	}
	public void setRetencionCredito(String retencionCredito) {
		this.retencionCredito = retencionCredito;
	}


	@Override
	public String toString() {
		return "ClienteV1 [codigo=" + codigo + ", nombreCorto=" + nombreCorto + ", razonSocial=" + razonSocial
				+ ", direccion=" + direccion + ", ciudad=" + ciudad + ", estado=" + estado + ", pais=" + pais
				+ ", comuna=" + comuna + ", region=" + region + ", canal=" + canal + ", tipoNegocio=" + tipoNegocio
				+ ", mercado=" + mercado + ", atencionLlamada=" + atencionLlamada + ", aliasGestor=" + aliasGestor
				+ ", ejecutivaVenta=" + ejecutivaVenta + ", gerenteCuenta=" + gerenteCuenta + ", aliasPropietario="
				+ aliasPropietario + ", telefono=" + telefono + ", telefono2=" + telefono2 + ", observacion="
				+ observacion + ", giro=" + giro + ", terminosPago=" + terminosPago + ", limiteCredito=" + limiteCredito
				+ ", rutCuentaPrincipal=" + rutCuentaPrincipal + ", cuenta=" + cuenta + ", cobrara=" + cobrara
				+ ", modeloAtencion=" + modeloAtencion + ", requiereOC=" + requiereOC + ", retencionCredito="
				+ retencionCredito + ", inactivo=" + inactivo + ", nombreContacto=" + nombreContacto
				+ ", telefonoContacto=" + telefonoContacto + ", lunes=" + lunes + ", martes=" + martes + ", miercoles="
				+ miercoles + ", jueves=" + jueves + ", viernes=" + viernes + ", sabado=" + sabado + ", ruta=" + ruta
				+ ", montoMinimo=" + montoMinimo + ", latitud=" + latitud + ", longitud=" + longitud + ", apertura="
				+ apertura + ", cierre=" + cierre + ", apertura2=" + apertura2 + ", cierre2=" + cierre2
				+ ", contratoComodato=" + contratoComodato + ", operadorLogistico=" + operadorLogistico
				+ ", territorio=" + territorio + ", anticipo=" + anticipo + ", chr01=" + chr01 + ", chr02=" + chr02
				+ ", chr03=" + chr03 + ", chr04=" + chr04 + ", chr05=" + chr05 + "]";
	}
	public String toStringJSON() {
		return "{  \"codigo\":\"" + codigo + "\","
				+ "\"nombreCorto\":\"" + nombreCorto + "\","
				+ "\"razonSocial\":\"" + razonSocial +"\","
				+ "\"direccion\":\"" + direccion + "\", "
				+ "\"ciudad\":\"" + ciudad + "\", "
				+ "\"estado\":\"" + estado + "\", "
				+ "\"pais\":\"" + pais+"\","
				+ "\"comuna\":\"" + comuna + "\", "
				+ "\"region\":\"" + region + "\","
				+ "\"canal\":\"" + canal + "\","
				+ "\"tipoNegocio\":\"" + tipoNegocio+"\","
				+ "\"mercado\":\"" + mercado + "\", "
				+ "\"atencionLlamada\":\"" + atencionLlamada + "\", "
				+ "\"aliasGestor\":\"" + aliasGestor+ "\", "
				+ "\"ejecutivaVenta\":\"" + ejecutivaVenta + "\", "
				+ "\"gerenteCuenta\":\"" + gerenteCuenta + "\", "
				+ "\"aliasPropietario\":\""+ aliasPropietario + "\", "
				+ "\"telefono\":\"" + telefono + "\", "
				+ "\"telefono2\":\"" + telefono2 + "\", "
				+ "\"observacion\":\""+ observacion + "\", "
				+ "\"giro\":\"" + giro + "\", "
				+ "\"terminosPago\":\"" + terminosPago + "\", "
				+ "\"limiteCredito\":\"" + limiteCredito + "\", "
				+ "\"rutCuentaPrincipal\":\"" + rutCuentaPrincipal + "\", "
				+ "\"cuenta\":\"" + cuenta + "\", "
				+ "\"cobrara\":\"" + cobrara+ "\", "
				+ "\"modeloAtencion\":\"" + modeloAtencion + "\", "
				+ "\"requiereOC\":\"" + requiereOC + "\", "
				+ "\"retencionCredito\":\"" + retencionCredito + "\", "
				+ "\"inactivo\":\"" + inactivo+ "\", "
				+ "\"nombreContacto\":\"" + nombreContacto + "\", "
				+ "\"telefonoContacto\":\"" + telefonoContacto + "\", "
				+ "\"lunes\":\"" + lunes+ "\", "
				+ "\"martes\":\"" + martes + "\", "
				+ "\"miercoles\":\"" + miercoles + "\", "
				+ "\"jueves\":\"" + jueves + "\", "
				+ "\"viernes\":\"" + viernes+ "\", "
				+ "\"sabado\":\"" + sabado + "\", "
				+ "\"ruta\":\"" + ruta + "\", "
				+ "\"montoMinimo\":\"" + montoMinimo + "\", "
				+ "\"latitud\":\"" + latitud+ "\", "
				+ "\"longitud\":\"" + longitud + "\", "
				+ "\"apertura\":\"" + apertura + "\", "
				+ "\"cierre\":\"" + cierre + "\", "
				+ "\"apertura2\":\""+apertura2 +"\", "
				+ "\"cierre2\":\"" + cierre2 + "\", "
				+ "\"contratoComodato\":\"" + contratoComodato + "\", "
				+ "\"operadorLogistico\":\"" + operadorLogistico + "\"}";
	}
	
}

