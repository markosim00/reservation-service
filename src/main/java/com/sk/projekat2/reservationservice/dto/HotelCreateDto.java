package com.sk.projekat2.reservationservice.dto;

import com.sk.projekat2.reservationservice.domain.City;

public class HotelCreateDto {
	
	private City city;
	private String name;
	
	public HotelCreateDto() {
		
	}
	
	public HotelCreateDto(City city, String name) {
		this.city = city;
		this.name = name;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
