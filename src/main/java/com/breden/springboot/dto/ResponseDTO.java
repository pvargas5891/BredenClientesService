package com.breden.springboot.dto;

public class ResponseDTO<T,O> {
	
	private String codigo;
	private String mensaje;
	private T response;
	private O objeto; 
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public T getResponse() {
		return response;
	}
	public void setResponse(T response) {
		this.response = response;
	}
	public O getObjeto() {
		return objeto;
	}
	public void setObjeto(O objeto) {
		this.objeto = objeto;
	}
	@Override
	public String toString() {
		return "ResponseDTO [codigo=" + codigo + ", mensaje=" + mensaje + ", response=" + response + ", objeto="
				+ objeto + "]";
	}	
	
}
