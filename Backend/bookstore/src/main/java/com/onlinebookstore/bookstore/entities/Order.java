package com.onlinebookstore.bookstore.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "orders")

public class Order extends BaseEntity{
	
	@OneToOne
	private Cart cart;
	private Integer quantity;
	private User customer;
	private LocalDate orderDate;
	@OneToOne
	private Payment payment;
	private DeliveryStatus status;
	
	
	

}
