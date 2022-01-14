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

import com.sk.projekat2.reservationservice.domain.Review;
import com.sk.projekat2.reservationservice.dto.ReservationCreateDto;
import com.sk.projekat2.reservationservice.dto.ReviewCreateDto;
import com.sk.projekat2.reservationservice.service.ReviewService;

@RestController
@RequestMapping("/review")
public class ReviewController {

	private ReviewService reviewService;

	public ReviewController(ReviewService reviewService) {
		this.reviewService = reviewService;
	}
	
	@GetMapping
	public ResponseEntity<Page<ReviewCreateDto>> getAllReviews(Pageable pageable){
		return new ResponseEntity<>(reviewService.findAll(pageable), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Void> addReview(@RequestBody ReviewCreateDto reviewCreateDto){
		reviewService.addReview(reviewCreateDto);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	public ResponseEntity<Void> updateReview(@PathVariable("id") Long id, @RequestBody Review review){
		reviewService.updateReview(id, review);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> removeReview(@PathVariable("id") Long id){
		reviewService.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
}
