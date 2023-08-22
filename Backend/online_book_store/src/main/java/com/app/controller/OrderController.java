package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.OrderDTO;
import com.app.dto.OrderRespDto;
import com.app.service.OrderService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/newOrder")
	public ResponseEntity<OrderRespDto> placeOrder(@RequestBody OrderDTO order)
	{
		return new ResponseEntity<>(orderService.placeOrder(order), HttpStatus.CREATED);
	}
	

}
