package com.sk.projekat2.reservationservice.dto;

public class RoomTypeCreateDto {
	
	private String name;
	
	public RoomTypeCreateDto() {
		
	}
	
	public RoomTypeCreateDto(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
