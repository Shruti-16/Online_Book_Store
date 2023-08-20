package com.onlinebookstore.bookstore.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
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
@Table(name = "payments")
public class Payment extends BaseEntity{
	
	private User customer;
	private Order order;
	private PaymentStatus paymentStatus;
	private PaymentMethod paymentMethod;
	
	
	

}
