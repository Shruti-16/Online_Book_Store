package com.app.controller;

<<<<<<< HEAD
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.BooksFromCartOrderDTO;
import com.app.service.CartService;
import com.app.service.OrderService;


@RestController
@RequestMapping("/carts")
//@CrossOrigin
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CartDTO;
import com.app.service.CartService;

@RestController
@RequestMapping("/carts")
@CrossOrigin
>>>>>>> 7abdb8a5e2adacbda91a4179810c782ecd18b224
public class CartController {

    @Autowired
    private CartService cartService;
<<<<<<< HEAD
    @Autowired
    private OrderService orderService;
    
    @PostMapping("/buyNow")
    public ResponseEntity<String> buyNow(@RequestParam Long userId) {
        orderService.createOrderFromCart(userId);
        return ResponseEntity.ok("Order placed successfully.");
    }
    
    @GetMapping("/getBooksInCart")
    public ResponseEntity<List<BooksFromCartOrderDTO>> getBooksInCart(@RequestParam Long userId) {
        List<BooksFromCartOrderDTO> booksInCart = cartService.getBooksInCart(userId);
        return ResponseEntity.ok(booksInCart);
    }
    
    @PostMapping("/addToCart")
    public ResponseEntity<String> addToCart(@RequestParam Long userId, @RequestParam Long bookId) {
        cartService.addToCart(userId, bookId);
        return ResponseEntity.ok("Book added to cart successfully.");
    }

//    // Create a new cart
//    @PostMapping("/create")
//    public ResponseEntity<CartDTO> createCart(@RequestBody CartDTO cartDTO) {
//        CartDTO createdCart = cartService.createCart(cartDTO);
//        return ResponseEntity.status(HttpStatus.CREATED).body(createdCart);
//    }
//
//    // Update an existing cart by ID
//    @PutMapping("/update/{cartId}")
//    public ResponseEntity<CartDTO> updateCart(@PathVariable Long cartId, @RequestBody CartDTO cartDTO) {
//        CartDTO updatedCart = cartService.updateCart(cartId, cartDTO);
//        return ResponseEntity.ok(updatedCart);
//    }
//
//    // Get cart by ID
//    @GetMapping("/{cartId}")
//    public ResponseEntity<CartDTO> getCartById(@PathVariable Long cartId) {
//        CartDTO cart = cartService.getCartById(cartId);
//        return ResponseEntity.ok(cart);
//    }
//
//    // Delete cart by ID
//    @DeleteMapping("/{cartId}")
//    public ResponseEntity<Void> deleteCart(@PathVariable Long cartId) {
//        cartService.deleteCart(cartId);
//        return ResponseEntity.noContent().build();
//    }
=======

    // Create a new cart
    @PostMapping("/create")
    public ResponseEntity<CartDTO> createCart(@RequestBody CartDTO cartDTO) {
        CartDTO createdCart = cartService.createCart(cartDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCart);
    }

    // Update an existing cart by ID
    @PutMapping("/update/{cartId}")
    public ResponseEntity<CartDTO> updateCart(@PathVariable Long cartId, @RequestBody CartDTO cartDTO) {
        CartDTO updatedCart = cartService.updateCart(cartId, cartDTO);
        return ResponseEntity.ok(updatedCart);
    }

    // Get cart by ID
    @GetMapping("/{cartId}")
    public ResponseEntity<CartDTO> getCartById(@PathVariable Long cartId) {
        CartDTO cart = cartService.getCartById(cartId);
        return ResponseEntity.ok(cart);
    }

    // Delete cart by ID
    @DeleteMapping("/{cartId}")
    public ResponseEntity<Void> deleteCart(@PathVariable Long cartId) {
        cartService.deleteCart(cartId);
        return ResponseEntity.noContent().build();
    }
>>>>>>> 7abdb8a5e2adacbda91a4179810c782ecd18b224
}
