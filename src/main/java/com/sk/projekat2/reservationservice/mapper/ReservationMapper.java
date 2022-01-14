package com.sk.projekat2.reservationservice.mapper;

import org.springframework.stereotype.Component;

import com.sk.projekat2.reservationservice.domain.Reservation;
import com.sk.projekat2.reservationservice.dto.ReservationCreateDto;

@Component
public class ReservationMapper {
	
	public ReservationCreateDto reservationToReservationCreateDto(Reservation reservation) {
		ReservationCreateDto reservationCreateDto = new ReservationCreateDto();
		reservationCreateDto.setUserId(reservation.getUserId());
		reservationCreateDto.setRoomTypeId(reservation.getRoomTypeId());
		reservationCreateDto.setTerminId(reservation.getTerminId());
		
		return reservationCreateDto;
	}

}
