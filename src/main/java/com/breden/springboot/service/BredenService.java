package com.breden.springboot.service;

import java.util.List;

import com.breden.springboot.customer.webservices.CustomerResponseType;
import com.breden.springboot.dto.ResponseDTO;
import com.breden.springboot.vo.ClienteV1;

public interface BredenService {
	public ResponseDTO<String,List<CustomerResponseType>> generaClienteSalesForce(ClienteV1 cliente);
}
