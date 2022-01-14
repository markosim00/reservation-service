package com.sk.projekat2.reservationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.projekat2.reservationservice.domain.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{

}
