package com.sk.projekat2.reservationservice.service.impl;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sk.projekat2.reservationservice.dto.ReservationCreateDto;
import com.sk.projekat2.reservationservice.mapper.ReservationMapper;
import com.sk.projekat2.reservationservice.repository.ReservationRepository;
import com.sk.projekat2.reservationservice.service.ReservationService;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService{
	
	private ReservationRepository reservationRepository;
	private ReservationMapper reservationMapper;
	
	public ReservationServiceImpl(ReservationRepository reservationRepository, ReservationMapper reservationMapper) {
		this.reservationRepository = reservationRepository;
		this.reservationMapper = reservationMapper;
	}

	@Override
	public void addReservation(ReservationCreateDto reservationCreateDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeReservation(ReservationCreateDto reservationCreateDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<ReservationCreateDto> findAll(Pageable pageable) {
		return reservationRepository.findAll(pageable)
				.map(reservationMapper::reservationToReservationCreateDto);
	}

}
