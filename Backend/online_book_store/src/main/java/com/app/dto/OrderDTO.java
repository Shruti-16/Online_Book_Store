package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
@ToString
public class OrderDTO {
	
	private Long userId;
	private Long bookId;
	private float price;
	
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public OrderDTO(Long userId, Long bookId, float price) {
		super();
		this.userId = userId;
		this.bookId = bookId;
		this.price = price;
	}
	public OrderDTO() {
		super();
	}
	
	

}
