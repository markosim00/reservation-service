package com.sk.projekat2.reservationservice.service;

import com.sk.projekat2.reservationservice.dto.ReservationCreateDto;

public interface ReservationService {
	
	void addReservation(ReservationCreateDto reservationCreateDto);
	
	void removeReservation(ReservationCreateDto reservationCreateDto);

}
