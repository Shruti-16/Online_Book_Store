package com.onlinebookstore.bookstore.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRespDto {
	private Long id;
	private double price;
	private LocalDateTime purchaseTime;
}

