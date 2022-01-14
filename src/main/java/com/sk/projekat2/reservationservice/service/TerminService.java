package com.sk.projekat2.reservationservice.service;

import com.sk.projekat2.reservationservice.dto.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TerminService {
	
	Page<TerminCreateDto> findAll(Pageable pageable);
	
	Page<TerminCreateDto> findAllTerminsByHotelId(Long hotelId);
	
	Page<TerminCreateDto> findAllTerminsByCityId(Long cityId);
	
	Page<TerminCreateDto> findAllTerminsByPeriodId(Long periodId);
	
	Page<TerminCreateDto> findAllTerminsByCityIdAndHotelId(Long cityId, Long hotelId);
	
	Page<TerminCreateDto> findAllTerminsByCityIdAndPeriodId(Long cityId, Long periodId);
	
	Page<TerminCreateDto> findAllTerminsByHotelIdAndPeriodId(Long hotelId, Long periodId);

}
