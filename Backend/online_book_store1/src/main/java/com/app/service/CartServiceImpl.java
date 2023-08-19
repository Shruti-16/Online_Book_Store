package com.app.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.Cart;
import com.app.repository.CartRepository;

@Service
@Transactional
public class CartServiceImpl implements CartService {
	
	//Dependency
	@Autowired
	CartRepository cartRepo;

	@Override
	public Cart addCart(@Valid Cart cart) {
		System.out.println("In add cart method..!"+getClass());
		return cartRepo.save(cart);
	}

}
