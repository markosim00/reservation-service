package com.sk.projekat2.reservationservice.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sk.projekat2.reservationservice.dto.ReviewCreateDto;
import com.sk.projekat2.reservationservice.dto.TerminCreateDto;
import com.sk.projekat2.reservationservice.mapper.TerminMapper;
import com.sk.projekat2.reservationservice.repository.TerminRepository;
import com.sk.projekat2.reservationservice.service.TerminService;

@Service
@Transactional
public class TerminServiceImpl implements TerminService{
	
	private TerminRepository terminRepository;
	private TerminMapper terminMapper;
	
	public TerminServiceImpl(TerminRepository terminRepository, TerminMapper terminMapper) {
		this.terminRepository = terminRepository;
		this.terminMapper = terminMapper;
	}

	@Override
	public Page<TerminCreateDto> findAll(Pageable pageable) {
		return terminRepository.findAll(pageable)
				.map(terminMapper::terminToTerminCreateDto);
	}

	@Override
	public Page<TerminCreateDto> findAllTerminsByHotelId(Pageable pageable, Long hotelId) {
		List<TerminCreateDto> allTermins = findAll(pageable).getContent();
		List<TerminCreateDto> terminsByHotel = new ArrayList<TerminCreateDto>();
		for(TerminCreateDto terminCreateDto : allTermins) {
			if(terminCreateDto.getHotelId() == hotelId)
				terminsByHotel.add(terminCreateDto);
		}
		Page<TerminCreateDto> allTerminsByHotelId = new PageImpl<>(terminsByHotel);
		return allTerminsByHotelId;
	}

	@Override
	public Page<TerminCreateDto> findAllTerminsByCityId(Pageable pageable, Long cityId) {
		List<TerminCreateDto> allTermins = findAll(pageable).getContent();
		List<TerminCreateDto> terminsByCity = new ArrayList<TerminCreateDto>();
		for(TerminCreateDto terminCreateDto : allTermins) {
			if(terminCreateDto.getCityId() == cityId)
				terminsByCity.add(terminCreateDto);
		}
		Page<TerminCreateDto> allTerminsByCityId = new PageImpl<>(terminsByCity);
		return allTerminsByCityId;
	}

	@Override
	public Page<TerminCreateDto> findAllTerminsByPeriodId(Pageable pageable, Long periodId) {
		List<TerminCreateDto> allTermins = findAll(pageable).getContent();
		List<TerminCreateDto> terminsByPeriod = new ArrayList<TerminCreateDto>();
		for(TerminCreateDto terminCreateDto : allTermins) {
			if(terminCreateDto.getPeriodId() == periodId)
				terminsByPeriod.add(terminCreateDto);
		}
		Page<TerminCreateDto> allTerminsByPeriodId = new PageImpl<>(terminsByPeriod);
		return allTerminsByPeriodId;
	}

	@Override
	public Page<TerminCreateDto> findAllTerminsByCityIdAndHotelId(Pageable pageable, Long cityId, Long hotelId) {
		List<TerminCreateDto> allTermins = findAll(pageable).getContent();
		List<TerminCreateDto> terminsByCityAndHotel = new ArrayList<TerminCreateDto>();
		for(TerminCreateDto terminCreateDto : allTermins) {
			if(terminCreateDto.getCityId() == cityId && terminCreateDto.getHotelId() == hotelId)
				terminsByCityAndHotel.add(terminCreateDto);
		}
		Page<TerminCreateDto> allTerminsByCityIdAndHotelId = new PageImpl<>(terminsByCityAndHotel);
		return allTerminsByCityIdAndHotelId;
	}

	@Override
	public Page<TerminCreateDto> findAllTerminsByCityIdAndPeriodId(Pageable pageable, Long cityId, Long periodId) {
		List<TerminCreateDto> allTermins = findAll(pageable).getContent();
		List<TerminCreateDto> terminsByCityAndPeriod = new ArrayList<TerminCreateDto>();
		for(TerminCreateDto terminCreateDto : allTermins) {
			if(terminCreateDto.getCityId() == cityId && terminCreateDto.getPeriodId() == periodId)
				terminsByCityAndPeriod.add(terminCreateDto);
		}
		Page<TerminCreateDto> allTerminsByCityIdAndPeriodId = new PageImpl<>(terminsByCityAndPeriod);
		return allTerminsByCityIdAndPeriodId;
	}

	@Override
	public Page<TerminCreateDto> findAllTerminsByHotelIdAndPeriodId(Pageable pageable, Long hotelId, Long periodId) {
		List<TerminCreateDto> allTermins = findAll(pageable).getContent();
		List<TerminCreateDto> terminsByHotelAndPeriod = new ArrayList<TerminCreateDto>();
		for(TerminCreateDto terminCreateDto : allTermins) {
			if(terminCreateDto.getHotelId() == hotelId && terminCreateDto.getPeriodId() == periodId)
				terminsByHotelAndPeriod.add(terminCreateDto);
		}
		Page<TerminCreateDto> allTerminsByHotelIdAndPeriodId = new PageImpl<>(terminsByHotelAndPeriod);
		return allTerminsByHotelIdAndPeriodId;
	}

	

}
