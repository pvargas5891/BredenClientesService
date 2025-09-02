package com.breden.springboot.service;

import java.util.List;

import com.breden.springboot.customer.webservices23.TtResponseResponseType;
import com.breden.springboot.dto.ResponseDTO;
import com.breden.springboot.vo.ClienteV1;

public interface BredenServiceV2 {
	public ResponseDTO<String,List<TtResponseResponseType>> generaClienteSalesForce(ClienteV1 cliente);
}
