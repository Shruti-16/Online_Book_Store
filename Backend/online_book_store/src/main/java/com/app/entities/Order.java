package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "orders")
public class Order extends BaseEntity{
	
	@OneToOne
	@JoinColumn(name = "cart_id")
	private Cart cart;
	private int quantity;
	@OneToOne
	private User customer;
	private LocalDate orderDate;
	@OneToOne
	private Payment payment;
	private DeliveryStatus status;

}
