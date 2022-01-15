package com.sk.projekat2.reservationservice.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sk.projekat2.reservationservice.dto.ReviewCreateDto;
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
	
	@GetMapping("/hotel/{id}")
	public ResponseEntity<Page<TerminCreateDto>> getAllTerminsByHotelId(Pageable pageable,@PathVariable("id") Long hotelId){
		return new ResponseEntity<>(terminService.findAllTerminsByHotelId(pageable, hotelId), HttpStatus.OK);
	}
	
	@GetMapping("/city/{id}")
	public ResponseEntity<Page<TerminCreateDto>> getAllTerminsByCityId(Pageable pageable,@PathVariable("id") Long cityId){
		return new ResponseEntity<>(terminService.findAllTerminsByCityId(pageable, cityId), HttpStatus.OK);
	}
	
	@GetMapping("/period/{id}")
	public ResponseEntity<Page<TerminCreateDto>> getAllTerminsByPeriodId(Pageable pageable,@PathVariable("id") Long periodId){
		return new ResponseEntity<>(terminService.findAllTerminsByPeriodId(pageable, periodId), HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<Page<TerminCreateDto>> getAllTerminsByCityIdAndHotelId(Pageable pageable,
			@RequestParam(name = "cityId") Long cityId,@RequestParam(name = "hotelId") Long hotelId){
		return new ResponseEntity<>(terminService.findAllTerminsByCityIdAndHotelId(pageable, cityId, hotelId), HttpStatus.OK);
	}
	/*
	@GetMapping("/")
	public ResponseEntity<Page<TerminCreateDto>> getAllTerminsByCityIdAndPeriodId(Pageable pageable,
			@RequestParam(name = "cityId") Long cityId,@RequestParam(name = "periodId") Long periodId){
		return new ResponseEntity<>(terminService.findAllTerminsByCityIdAndPeriodId(pageable, cityId, periodId), HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<Page<TerminCreateDto>> getAllTerminsByHotelIdAndPeriodId(Pageable pageable,
			@RequestParam(name = "hotelId") Long hotelId,@RequestParam(name = "periodId") Long periodId){
		return new ResponseEntity<>(terminService.findAllTerminsByHotelIdAndPeriodId(pageable, hotelId, periodId), HttpStatus.OK);
	}*/
	
}
