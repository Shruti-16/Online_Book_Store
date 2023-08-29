package com.app.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.app.entities.Book;
import com.app.entities.DeliveryStatus;

public class OrderRespDto {

	private Long id;
	private float price;
	private int quantity;
	private LocalDate orderDate;
	private List<Book> books = new ArrayList<Book>();
	private DeliveryStatus deliveryStatus = DeliveryStatus.ORDERED;

	public OrderRespDto() {
		super();
	}

	public OrderRespDto(Long id, float price, int quantity, LocalDate orderDate, List<Book> books,
			DeliveryStatus deliveryStatus) {
		super();
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		this.orderDate = orderDate;
		this.books = books;
		this.deliveryStatus = deliveryStatus;
	}

	public OrderRespDto(Long orderId, int quantity2, LocalDate orderDate2, DeliveryStatus status, List<Book> books) {
		this.id = orderId;
		this.quantity = quantity2;
		this.orderDate = orderDate2;
		this.books = books;
		this.deliveryStatus = status;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public DeliveryStatus getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

}
