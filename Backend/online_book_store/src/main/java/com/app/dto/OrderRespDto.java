package com.app.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.app.entities.Book;
import com.app.entities.DeliveryStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRespDto {
	
	private Long id;
	private float price;
	private int quantity;
	private LocalDate orderDate;
	private List<Book> books = new ArrayList<Book>();
	private DeliveryStatus deliveryStatus = DeliveryStatus.ORDERED;
	
	
	

}
