package com.breden.springboot.service;

import java.util.List;

import com.breden.springboot.detail.webservices.TtResponseResponseType;
import com.breden.springboot.dto.ResponseDTO;
import com.breden.springboot.vo.ClienteV1;

public interface BredenServiceDetail {
	public ResponseDTO<String,List<TtResponseResponseType>> generaClienteDetalleSalesForce(ClienteV1 cliente);
	public void generaLog(String responseDto,String mensaje, String cliente);
	
}
