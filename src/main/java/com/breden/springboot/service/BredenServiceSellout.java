package com.breden.springboot.service;

import java.util.List;

import com.breden.springboot.dto.ResponseDTO;
import com.breden.springboot.sellout.services.TtResponse;
import com.breden.springboot.sellout.services.TtSellOutType;

public interface BredenServiceSellout {
	public ResponseDTO<String,List<TtResponse>> recpecionSellout(TtSellOutType data);
}
