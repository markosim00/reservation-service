package com.sk.projekat2.reservationservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.projekat2.reservationservice.service.ReservationService;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
	
	private ReservationService reservationService;

	public ReservationController(ReservationService reservationService) {
		this.reservationService = reservationService;
	}
	
	

}
