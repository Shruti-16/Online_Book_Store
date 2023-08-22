package com.app.entities;

import javax.persistence.Entity;
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
@Table(name = "payments")
public class Payment extends BaseEntity {
	@OneToOne
	private User customer;
	@OneToOne
	private Order order;
	private PaymentStatus status;
	private PaymentMethod method;

}
