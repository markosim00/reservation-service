package com.sk.projekat2.reservationservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.projekat2.reservationservice.service.TerminService;

@RestController
@RequestMapping("/termin")
public class TerminController {
	
	private TerminService terminService;

	public TerminController(TerminService terminService) {
		this.terminService = terminService;
	}
	
	

}
