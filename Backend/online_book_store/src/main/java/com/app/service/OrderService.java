package com.app.service;

import java.util.List;

import com.app.dto.OrderDTO;
import com.app.dto.OrderRespDto;
import com.app.entity.projection.OrderBook;

public interface OrderService {

	OrderRespDto placeOrder(OrderDTO order);

//	List<OrderBook> findPurchaseBooksOfUser(String username);
	List<OrderRespDto> displayAllPurchasedBooksForUser(Long userId);

}
