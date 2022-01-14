package com.sk.projekat2.reservationservice.service.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.sk.projekat2.reservationservice.dto.ReservationCreateDto;
import com.sk.projekat2.reservationservice.service.ReservationService;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService{

	@Override
	public void addReservation(ReservationCreateDto reservationCreateDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeReservation(ReservationCreateDto reservationCreateDto) {
		// TODO Auto-generated method stub
		
	}

}
