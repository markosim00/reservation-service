package com.sk.projekat2.reservationservice.dto;

public class ReservationCreateDto {
	
	private Long userId;
	private Long roomTypeId;
	private Long periodId;
	
	public ReservationCreateDto() {
		
	}

	public ReservationCreateDto(Long userId, Long roomTypeId, Long periodId) {
		this.userId = userId;
		this.roomTypeId = roomTypeId;
		this.periodId = periodId;
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

	public Long getPeriodId() {
		return periodId;
	}

	public void setPeriodId(Long periodId) {
		this.periodId = periodId;
	}
	
	

}
