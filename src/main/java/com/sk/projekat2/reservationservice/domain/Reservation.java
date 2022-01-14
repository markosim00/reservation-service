package com.sk.projekat2.reservationservice.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long userId;
	private Long roomTypeId;
	private Long terminId;
	private BigDecimal price;
	
	public Reservation() {
		
	}
	
	public Reservation(Long userId, Long roomTypeId, Long terminId, BigDecimal price) {
		this.userId = userId;
		this.roomTypeId = roomTypeId;
		this.terminId = terminId;
		this.price = price;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	

}
