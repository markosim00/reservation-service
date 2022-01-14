package com.sk.projekat2.reservationservice.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sk.projekat2.reservationservice.dto.ReservationCreateDto;

public interface ReservationService {
	
	Page<ReservationCreateDto> findAll(Pageable pageable);
	
	void addReservation(ReservationCreateDto reservationCreateDto);
	
	void removeReservation(ReservationCreateDto reservationCreateDto);

}
