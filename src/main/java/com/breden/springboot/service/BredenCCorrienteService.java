package com.breden.springboot.service;

import java.util.List;

import com.breden.springboot.dto.ResponseDTO;
import com.breden.springboot.cuentacorriente.services.Tt_doctosResponseType;

public interface BredenCCorrienteService {
	public ResponseDTO<String, List<Tt_doctosResponseType>> corriente(String fecha);
}
