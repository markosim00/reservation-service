package com.sk.projekat2.reservationservice.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.projekat2.reservationservice.dto.ReservationCreateDto;
import com.sk.projekat2.reservationservice.service.ReservationService;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
	
	private ReservationService reservationService;

	public ReservationController(ReservationService reservationService) {
		this.reservationService = reservationService;
	}
	
	@GetMapping
	public ResponseEntity<Page<ReservationCreateDto>> getAllReservations(Pageable pageable){
		return new ResponseEntity<>(reservationService.findAll(pageable), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Void> addReservation(@RequestBody ReservationCreateDto reservationCreateDto){
		reservationService.addReservation(reservationCreateDto);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> removeReservation(@PathVariable("id") Long id){
		reservationService.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
