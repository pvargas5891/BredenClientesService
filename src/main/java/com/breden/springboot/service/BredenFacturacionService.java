package com.breden.springboot.service;

import java.util.List;


import com.breden.springboot.dto.ResponseDTO;
import com.breden.springboot.facturacion.services.TtidhhistResponseType;

public interface BredenFacturacionService {
	public ResponseDTO<String,List<TtidhhistResponseType>> facturaciones(String fecha);
}
