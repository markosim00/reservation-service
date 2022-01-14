package com.sk.projekat2.reservationservice.dto;

import java.util.Date;

public class PeriodCreateDto {
	
	private Date checkIn;
	private Date checkOut;
	
	public PeriodCreateDto() {
		
	}
	
	public PeriodCreateDto(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
	
	

}
