package com.app.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRespDto {
	
	private Long id;
	private float price;
	private LocalDateTime purchaseTime;
	

}
