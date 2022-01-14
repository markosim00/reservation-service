package com.sk.projekat2.reservationservice.dto;

public class TerminCreateDto {
	
	private Long cityId;
	private Long hotelId;
	private Long periodId;
	
	public TerminCreateDto() {
		
	}

	public TerminCreateDto(Long cityId, Long hotelId, Long periodId) {
		this.cityId = cityId;
		this.hotelId = hotelId;
		this.periodId = periodId;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public Long getPeriodId() {
		return periodId;
	}

	public void setPeriodId(Long periodId) {
		this.periodId = periodId;
	}
	
	
	
	

}
