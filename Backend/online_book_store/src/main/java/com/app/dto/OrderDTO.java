package com.app.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.app.entities.Cart;
import com.app.entities.DeliveryStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OrderDTO {
	
	@NotNull
	private Long userId;
	@Min(value = 0, message = "Price should not be less than 0")
	private float price;
	@NotNull
	private Long cartId;
	@JsonIgnore
	private LocalDateTime orderDateTime;
	private DeliveryStatus deliveryStatus;
	
	public OrderDTO(@NotNull Long userId, @Min(value = 0, message = "Price should not be less than 0") float price,
			@NotNull Long cartId) {
		super();
		this.userId = userId;
		this.price = price;
		this.cartId = cartId;
		this.orderDateTime = LocalDateTime.now();
		this.deliveryStatus = DeliveryStatus.ORDERED;
	}
	

}
