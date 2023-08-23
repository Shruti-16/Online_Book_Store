 
  package com.app.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@ToString
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;

	@OneToOne
	@JoinColumn(name = "cart_id")
	private Cart cart;
	private float totalPrice;
	private int quantity;
	private LocalDateTime orderDate;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id" , nullable = false)
	private User user;
	@OneToMany(mappedBy = "order")
	private List<Book> books = new ArrayList<>();
	@Enumerated(EnumType.STRING)	  
	private DeliveryStatus deliveryStatus;
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public DeliveryStatus getStatus() {
		return deliveryStatus;
	}
	public void setStatus(DeliveryStatus status) {
		this.deliveryStatus = status;
	}
	public Order(Long orderId, Cart cart, float totalPrice, int quantity, LocalDateTime orderDate, User user,
			List<Book> books, DeliveryStatus status) {
		super();
		this.orderId = orderId;
		this.cart = cart;
		this.totalPrice = totalPrice;
		this.quantity = quantity;
		this.orderDate = orderDate;
		this.user = user;
		this.books = books;
		this.deliveryStatus = status;
	}
	public Order() {
		super();
	}



}
