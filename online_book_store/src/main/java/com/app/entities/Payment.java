package com.app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
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
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long paymentId;

	@OneToOne
	@JoinColumn(name = "customer_id")
	private User customer;
	@OneToOne
	@JoinColumn(name = "order_id")
	@MapsId
	private Order order;
	@Enumerated(EnumType.STRING)	  

	private PaymentStatus status = PaymentStatus.SUCCESSFUL;
	@Enumerated(EnumType.STRING)	  

	private PaymentMethod method;

	public Payment() {
		super();
	}

	public Payment(Long paymentId, User customer, Order order, PaymentStatus status, PaymentMethod method) {
		super();
		this.paymentId = paymentId;
		this.customer = customer;
		this.order = order;
		this.status = status;
		this.method = method;
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public PaymentStatus getStatus() {
		return status;
	}

	public void setStatus(PaymentStatus status) {
		this.status = status;
	}

	public PaymentMethod getMethod() {
		return method;
	}

	public void setMethod(PaymentMethod method) {
		this.method = method;
	}

}
