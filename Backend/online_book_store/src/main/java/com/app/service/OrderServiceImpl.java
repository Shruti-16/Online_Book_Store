package com.app.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.OrderDTO;
import com.app.dto.OrderRespDto;
import com.app.entities.Book;
import com.app.entities.Order;
import com.app.entities.User;
import com.app.repository.BookRepository;
import com.app.repository.OrderRepository;
import com.app.repository.UserRepository;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepo;

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private BookRepository bookRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public OrderRespDto placeOrder(OrderDTO order) {
		
		System.out.println(order.getBookId());
//		User user = userRepo.getReferenceById(order.getUserId());
//		Book book = bookRepo.getReferenceById(order.getBookId());
		
		 User user = userRepo.findById(order.getUserId()).orElse(null);
		 Book book = bookRepo.findById(order.getBookId()).orElse(null);
		
		Order newOrder = new Order();		
		newOrder.setUser(user);
		newOrder.setBooks(book);
		Order savedOrder = orderRepo.save(newOrder);
		OrderRespDto ret = mapper.map(savedOrder, OrderRespDto.class);
		return ret;
	}

}
