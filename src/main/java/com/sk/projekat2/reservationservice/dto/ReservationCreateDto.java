package com.sk.projekat2.reservationservice.dto;

import java.math.BigDecimal;

public class ReservationCreateDto {
	
	private Long userId;
	private Long roomTypeId;
	private Long terminId;
	private BigDecimal price;
	
	public ReservationCreateDto() {
		
	}

	public ReservationCreateDto(Long userId, Long roomTypeId, Long terminId, BigDecimal price) {
		this.userId = userId;
		this.roomTypeId = roomTypeId;
		this.terminId = terminId;
		this.price = price;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(Long roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public Long getTerminId() {
		return terminId;
	}

	public void setTerminId(Long terminId) {
		this.terminId = terminId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	

}
