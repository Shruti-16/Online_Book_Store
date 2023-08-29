package com.app.service;

import java.util.List;

import com.app.dto.OrderRespDto;

public interface OrderService {
	public void createOrderFromCart(Long userId);

	public List<OrderRespDto> getOrdersForUser(Long userId);

}
