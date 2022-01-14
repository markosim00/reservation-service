package com.sk.projekat2.reservationservice.service.impl;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sk.projekat2.reservationservice.dto.TerminCreateDto;
import com.sk.projekat2.reservationservice.service.TerminService;

@Service
@Transactional
public class TerminServiceImpl implements TerminService{

	@Override
	public Page<TerminCreateDto> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<TerminCreateDto> findAllTerminsByHotelId(Long hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<TerminCreateDto> findAllTerminsByCityId(Long cityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<TerminCreateDto> findAllTerminsByPeriodId(Long periodId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<TerminCreateDto> findAllTerminsByCityIdAndHotelId(Long cityId, Long hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<TerminCreateDto> findAllTerminsByCityIdAndPeriodId(Long cityId, Long periodId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<TerminCreateDto> findAllTerminsByHotelIdAndPeriodId(Long hotelId, Long periodId) {
		// TODO Auto-generated method stub
		return null;
	}

}
