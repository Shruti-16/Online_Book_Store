package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.OrderDTO;
import com.app.dto.OrderRespDto;
import com.app.entity.projection.OrderBook;
import com.app.service.CustomUserDetails;
import com.app.service.OrderService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/newOrder")
	public ResponseEntity<OrderRespDto> placeOrder(@RequestBody OrderDTO order) {
		OrderRespDto response = orderService.placeOrder(order);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
	
//	@GetMapping
//	public ResponseEntity<List<OrderBook>> getAllPurchasedBooksOfUser(@AuthenticationPrincipal CustomUserDetails user) {
//		List<OrderBook> purchasedBooks = orderService.findPurchaseBooksOfUser(user.getUsername());
//		return ResponseEntity.ok(purchasedBooks);
//	}

    @GetMapping("/purchasedBooks/{userId}")
    public ResponseEntity<List<OrderRespDto>> displayAllPurchasedBooks(@PathVariable Long userId) {
        List<OrderRespDto> purchasedBooks = orderService.displayAllPurchasedBooksForUser(userId);
        if (purchasedBooks == null) {
            // Handle user not found
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(purchasedBooks);
    }

}
