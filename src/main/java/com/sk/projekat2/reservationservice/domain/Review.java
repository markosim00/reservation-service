package com.sk.projekat2.reservationservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int mark;
	private String comment;
	@ManyToOne(optional = true)
	private Hotel hotel;
	@ManyToOne(optional = true)
	private City city;
	
	public Review() {
		
	}
	
	public Review(int mark, String comment, Hotel hotel) {
		this.mark = mark;
		this.comment = comment;
		this.hotel = hotel;
	}
	
	public Review(int mark, String comment, City city) {
		this.mark = mark;
		this.comment = comment;
		this.city = city;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	
	
	

}
