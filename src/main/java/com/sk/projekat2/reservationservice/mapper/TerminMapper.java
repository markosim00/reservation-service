package com.sk.projekat2.reservationservice.mapper;

import org.springframework.stereotype.Component;

import com.sk.projekat2.reservationservice.domain.Termin;
import com.sk.projekat2.reservationservice.dto.TerminCreateDto;

@Component
public class TerminMapper {
	
	public TerminCreateDto terminToTerminCreateDto(Termin termin) {
		TerminCreateDto terminCreateDto = new TerminCreateDto();
		terminCreateDto.setCityId(termin.getCityId());
		terminCreateDto.setHotelId(termin.getHotelId());
		terminCreateDto.setPeriodId(termin.getPeriodId());
		
		return terminCreateDto;
	}

}
