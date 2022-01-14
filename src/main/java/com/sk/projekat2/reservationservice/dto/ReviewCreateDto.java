package com.sk.projekat2.reservationservice.dto;

import com.sk.projekat2.reservationservice.domain.City;
import com.sk.projekat2.reservationservice.domain.Hotel;

public class ReviewCreateDto {
	
	private int mark;
	private String comment;
	private City city;
	private Hotel hotel;
	
	public ReviewCreateDto() {
		
	}

	public ReviewCreateDto(int mark, String comment) {
		this.mark = mark;
		this.comment = comment;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	
	

}
