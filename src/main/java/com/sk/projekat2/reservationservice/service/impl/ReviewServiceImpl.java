package com.sk.projekat2.reservationservice.service.impl;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sk.projekat2.reservationservice.domain.Review;
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
	public Page<ReviewCreateDto> findAllReviewsByHotelId(Pageable pageable, Long hotelId) {
		return null;
	}

	@Override
	public Page<ReviewCreateDto> findAllReviewsByCityId(Pageable pageable, Long cityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<ReviewCreateDto> findAllReviewsByCityIdAndHotelId(Pageable pageable, Long cityId, Long hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addReview(ReviewCreateDto reviewCreateDto) {
		Review review = null;
		if(reviewCreateDto.getHotel() != null)
			review = new Review(reviewCreateDto.getMark(), reviewCreateDto.getComment(), reviewCreateDto.getHotel());
		else if(reviewCreateDto.getCity() != null)
			review = new Review(reviewCreateDto.getMark(), reviewCreateDto.getComment(), reviewCreateDto.getCity());
		reviewRepository.save(review);
	}

	@Override
	public void deleteById(Long id) {
		reviewRepository.deleteById(id);
	}

	@Override
	public void updateReview(Long id, Review review) {
		reviewRepository.getById(id).setMark(review.getMark());
		reviewRepository.getById(id).setComment(review.getComment());
	}
	
	

}
