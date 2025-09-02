package com.breden.springboot.service;

import java.util.List;

import com.breden.springboot.dto.ResponseDTO;
import com.breden.springboot.pagadores.services.TtResponseResponseType;
import com.breden.springboot.vo.Pagador;

public interface BredenPagadoresService {
	public ResponseDTO<String, List<TtResponseResponseType>> pagadores(Pagador pagador);

}
