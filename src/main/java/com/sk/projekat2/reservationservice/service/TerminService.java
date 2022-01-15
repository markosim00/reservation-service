package com.sk.projekat2.reservationservice.service;

import com.sk.projekat2.reservationservice.dto.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TerminService {
	
	Page<TerminCreateDto> findAll(Pageable pageable);
	
	Page<TerminCreateDto> findAllTerminsByHotelId(Pageable pageable, Long hotelId);
	
	Page<TerminCreateDto> findAllTerminsByCityId(Pageable pageable, Long cityId);
	
	Page<TerminCreateDto> findAllTerminsByPeriodId(Pageable pageable, Long periodId);
	
	Page<TerminCreateDto> findAllTerminsByCityIdAndHotelId(Pageable pageable, Long cityId, Long hotelId);
	
	Page<TerminCreateDto> findAllTerminsByCityIdAndPeriodId(Pageable pageable, Long cityId, Long periodId);
	
	Page<TerminCreateDto> findAllTerminsByHotelIdAndPeriodId(Pageable pageable, Long hotelId, Long periodId);

}
