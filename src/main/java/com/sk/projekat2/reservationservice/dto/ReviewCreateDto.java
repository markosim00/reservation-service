package com.sk.projekat2.reservationservice.dto;

public class ReviewCreateDto {
	
	private int mark;
	private String comment;
	
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
	
	
	

}
