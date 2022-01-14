package com.sk.projekat2.reservationservice.mapper;

import org.springframework.stereotype.Component;

import com.sk.projekat2.reservationservice.domain.Review;
import com.sk.projekat2.reservationservice.dto.ReviewCreateDto;

@Component
public class ReviewMapper {
	
	public ReviewCreateDto reviewToReviewCreateDto(Review review) {
		ReviewCreateDto reviewCreateDto = new ReviewCreateDto();
		reviewCreateDto.setMark(review.getMark());
		reviewCreateDto.setComment(review.getComment());
		
		return reviewCreateDto;
	}

}
