package com.sk.projekat2.reservationservice.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sk.projekat2.reservationservice.dto.*;

public interface ReviewService {
	
	Page<ReviewCreateDto> findAll(Pageable pageable);
	
	Page<ReviewCreateDto> findAllReviewsByHotelId(Long hotelId);
	
	Page<ReviewCreateDto> findAllReviewsByCityId(Long cityId);
	
	Page<ReviewCreateDto> findAllReviewsByCityIdAndHotelId(Long cityId, Long hotelId);
	
	void addReview(ReviewCreateDto reviewCreateDto);
	
	void removeReview(ReviewCreateDto reviewCreateDto);
	
	void updateReview(Long id);

}
