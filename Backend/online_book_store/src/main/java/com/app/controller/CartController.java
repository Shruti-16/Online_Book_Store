package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.entities.Cart;
import com.app.service.CartService;

@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "http://localhost:3000")
public class CartController {

	// Dependencies
	@Autowired
	CartService cartService;
	
	@Autowired
	//UserRepository userRepo;

	@PostMapping("/{userId}")
	public ResponseEntity<?> addUserCart(@PathVariable long userId, @RequestBody @Valid Cart cart) {

		//cart.setUser(userRepo.findByID(userId).orElseThrow(()-> new ResourceNotFoundException("Invalid User")));
		return new ResponseEntity<>(cartService.addCart(cart), HttpStatus.CREATED);
	}

}
