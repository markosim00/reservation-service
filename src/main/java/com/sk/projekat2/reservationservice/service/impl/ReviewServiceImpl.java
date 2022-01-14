package com.sk.projekat2.reservationservice.service.impl;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sk.projekat2.reservationservice.dto.ReviewCreateDto;
import com.sk.projekat2.reservationservice.mapper.ReviewMapper;
import com.sk.projekat2.reservationservice.repository.ReviewRepository;
import com.sk.projekat2.reservationservice.service.ReviewService;

@Service
@Transactional
public class ReviewServiceImpl implements ReviewService{
	
	private ReviewRepository reviewRepository;
	private ReviewMapper reviewMapper;
	
	public ReviewServiceImpl(ReviewRepository reviewRepository, ReviewMapper reviewMapper) {
		this.reviewRepository = reviewRepository;
		this.reviewMapper = reviewMapper;
	}

	@Override
	public Page<ReviewCreateDto> findAll(Pageable pageable) {
		return reviewRepository.findAll(pageable)
				.map(reviewMapper::reviewToReviewCreateDto);
	}

	@Override
	public Page<ReviewCreateDto> findAllReviewsByHotelId(Long hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<ReviewCreateDto> findAllReviewsByCityId(Long cityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<ReviewCreateDto> findAllReviewsByCityIdAndHotelId(Long cityId, Long hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addReview(ReviewCreateDto reviewCreateDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeReview(ReviewCreateDto reviewCreateDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateReview(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
