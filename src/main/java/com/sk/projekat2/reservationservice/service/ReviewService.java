package com.sk.projekat2.reservationservice.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sk.projekat2.reservationservice.domain.Review;
import com.sk.projekat2.reservationservice.dto.*;

public interface ReviewService {
	
	Page<ReviewCreateDto> findAll(Pageable pageable);
	
	Page<ReviewCreateDto> findAllReviewsByHotelId(Pageable pageable, Long hotelId);
	
	Page<ReviewCreateDto> findAllReviewsByCityId(Pageable pageable, Long cityId);
	
	Page<ReviewCreateDto> findAllReviewsByCityIdAndHotelId(Pageable pageable, Long cityId, Long hotelId);
	
	void addReview(ReviewCreateDto reviewCreateDto);
	
	void deleteById(Long id);
	
	void updateReview(Long id, Review review);

}
