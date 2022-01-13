package com.sk.projekat2.reservationservice.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RoomType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int minRoomNumber;
	private int maxRoomNumber;
	private String name;
	private BigDecimal price;
	@ManyToOne
	private Hotel hotel;
	
	
	public int getMinRoomNumber() {
		return minRoomNumber;
	}
	public void setMinRoomNumber(int minRoomNumber) {
		this.minRoomNumber = minRoomNumber;
	}
	public int getMaxRoomNumber() {
		return maxRoomNumber;
	}
	public void setMaxRoomNumber(int maxRoomNumber) {
		this.maxRoomNumber = maxRoomNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
	
}
