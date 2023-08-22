package com.app.service;

import com.app.dto.OrderDTO;
import com.app.dto.OrderRespDto;

public interface OrderService {

	OrderRespDto placeOrder(OrderDTO order);

}
