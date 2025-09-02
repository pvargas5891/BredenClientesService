package com.breden.springboot.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Pagador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String dominio;
	private String codigo;
	private String rutPagador;
	private String nombrePagador;
	private String telefono;
	private String correo;
	private String chr01;
	private String chr02;
	private String chr03;
	private String chr04;
	private String chr05;
	private String dec01;
	private String dec02;
	private String dec03;
	private String dec04;
	private String dec05;
	private String log01;
	private String log02;
	private String log03;

	/**
	 * @return String return the dominio
	 */
	public String getDominio() {
		return dominio;
	}

	/**
	 * @param dominio the dominio to set
	 */
	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	/**
	 * @return String return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return String return the rutPagador
	 */
	public String getRutPagador() {
		return rutPagador;
	}

	/**
	 * @param rutPagador the rutPagador to set
	 */
	public void setRutPagador(String rutPagador) {
		this.rutPagador = rutPagador;
	}

	/**
	 * @return String return the nombrePagador
	 */
	public String getNombrePagador() {
		return nombrePagador;
	}

	/**
	 * @param nombrePagador the nombrePagador to set
	 */
	public void setNombrePagador(String nombrePagador) {
		this.nombrePagador = nombrePagador;
	}

	/**
	 * @return String return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return String return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return String return the chr01
	 */
	public String getChr01() {
		return chr01;
	}

	/**
	 * @param chr01 the chr01 to set
	 */
	public void setChr01(String chr01) {
		this.chr01 = chr01;
	}

	/**
	 * @return String return the chr02
	 */
	public String getChr02() {
		return chr02;
	}

	/**
	 * @param chr02 the chr02 to set
	 */
	public void setChr02(String chr02) {
		this.chr02 = chr02;
	}

	/**
	 * @return String return the chr03
	 */
	public String getChr03() {
		return chr03;
	}

	/**
	 * @param chr03 the chr03 to set
	 */
	public void setChr03(String chr03) {
		this.chr03 = chr03;
	}

	/**
	 * @return String return the chr04
	 */
	public String getChr04() {
		return chr04;
	}

	/**
	 * @param chr04 the chr04 to set
	 */
	public void setChr04(String chr04) {
		this.chr04 = chr04;
	}

	/**
	 * @return String return the chr05
	 */
	public String getChr05() {
		return chr05;
	}

	/**
	 * @param chr05 the chr05 to set
	 */
	public void setChr05(String chr05) {
		this.chr05 = chr05;
	}

	/**
	 * @return String return the dec01
	 */
	public String getDec01() {
		return dec01;
	}

	/**
	 * @param dec01 the dec01 to set
	 */
	public void setDec01(String dec01) {
		this.dec01 = dec01;
	}

	/**
	 * @return String return the dec02
	 */
	public String getDec02() {
		return dec02;
	}

	/**
	 * @param dec02 the dec02 to set
	 */
	public void setDec02(String dec02) {
		this.dec02 = dec02;
	}

	/**
	 * @return String return the dec03
	 */
	public String getDec03() {
		return dec03;
	}

	/**
	 * @param dec03 the dec03 to set
	 */
	public void setDec03(String dec03) {
		this.dec03 = dec03;
	}

	/**
	 * @return String return the dec04
	 */
	public String getDec04() {
		return dec04;
	}

	/**
	 * @param dec04 the dec04 to set
	 */
	public void setDec04(String dec04) {
		this.dec04 = dec04;
	}

	/**
	 * @return String return the dec05
	 */
	public String getDec05() {
		return dec05;
	}

	/**
	 * @param dec05 the dec05 to set
	 */
	public void setDec05(String dec05) {
		this.dec05 = dec05;
	}

	/**
	 * @return String return the log01
	 */
	public String getLog01() {
		return log01;
	}

	/**
	 * @param log01 the log01 to set
	 */
	public void setLog01(String log01) {
		this.log01 = log01;
	}

	/**
	 * @return String return the log02
	 */
	public String getLog02() {
		return log02;
	}

	/**
	 * @param log02 the log02 to set
	 */
	public void setLog02(String log02) {
		this.log02 = log02;
	}

	/**
	 * @return String return the log03
	 */
	public String getLog03() {
		return log03;
	}

	/**
	 * @param log03 the log03 to set
	 */
	public void setLog03(String log03) {
		this.log03 = log03;
	}

	@Override
	public String toString() {
		return "Pagador [dominio=" + dominio + ", codigo=" + codigo + ", rutPagador=" + rutPagador + ", nombrePagador="
				+ nombrePagador + ", telefono=" + telefono + ", correo=" + correo + ", chr01=" + chr01 + ", chr02="
				+ chr02 + ", chr03=" + chr03 + ", chr04=" + chr04 + ", chr05=" + chr05 + ", dec01=" + dec01 + ", dec02="
				+ dec02 + ", dec03=" + dec03 + ", dec04=" + dec04 + ", dec05=" + dec05 + ", log01=" + log01 + ", log02="
				+ log02 + ", log03=" + log03 + "]";
	}

}
