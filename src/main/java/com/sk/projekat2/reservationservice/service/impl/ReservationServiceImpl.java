package com.sk.projekat2.reservationservice.service.impl;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sk.projekat2.reservationservice.domain.Reservation;
import com.sk.projekat2.reservationservice.dto.ReservationCreateDto;
import com.sk.projekat2.reservationservice.mapper.ReservationMapper;
import com.sk.projekat2.reservationservice.repository.ReservationRepository;
import com.sk.projekat2.reservationservice.service.ReservationService;

import com.sk.projekat2.reservationservice.client.userservice.dto.*;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService{
	
	private ReservationRepository reservationRepository;
	private ReservationMapper reservationMapper;
	private RestTemplate userServiceRestTemplate;
	private RestTemplate mailServiceRestTemplate;
	
	public ReservationServiceImpl(ReservationRepository reservationRepository, ReservationMapper reservationMapper,
			RestTemplate userServiceRestTemplate, RestTemplate mailServiceRestTemplate) {
		this.reservationRepository = reservationRepository;
		this.reservationMapper = reservationMapper;
		this.userServiceRestTemplate = userServiceRestTemplate;
		this.mailServiceRestTemplate = mailServiceRestTemplate;
	}

	@Override
	public void addReservation(ReservationCreateDto reservationCreateDto) {
		
		ResponseEntity<DiscountDto> discountDtoResponseEntity = userServiceRestTemplate.exchange("/user/" +
                reservationCreateDto.getUserId() + "/discount", HttpMethod.GET, null, DiscountDto.class);
		BigDecimal price = reservationCreateDto.getPrice().divide(BigDecimal.valueOf(100))
				.multiply(BigDecimal.valueOf(100 - discountDtoResponseEntity.getBody().getDiscount()));
		Reservation reservation = new Reservation(reservationCreateDto.getUserId(), reservationCreateDto.getRoomTypeId(),
				reservationCreateDto.getTerminId(), price);
		reservationRepository.save(reservation);
	}


	@Override
	public Page<ReservationCreateDto> findAll(Pageable pageable) {
		return reservationRepository.findAll(pageable)
				.map(reservationMapper::reservationToReservationCreateDto);
	}

	@Override
	public void deleteById(Long id) {
		reservationRepository.deleteById(id);
	}

}
