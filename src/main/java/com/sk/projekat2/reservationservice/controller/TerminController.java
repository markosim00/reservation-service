package com.sk.projekat2.reservationservice.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.projekat2.reservationservice.dto.TerminCreateDto;
import com.sk.projekat2.reservationservice.service.TerminService;

@RestController
@RequestMapping("/termin")
public class TerminController {
	
	private TerminService terminService;

	public TerminController(TerminService terminService) {
		this.terminService = terminService;
	}
	
	@GetMapping
	public ResponseEntity<Page<TerminCreateDto>> getAllTermins(Pageable pageable){
		return new ResponseEntity<>(terminService.findAll(pageable), HttpStatus.OK);
	}
	

}
