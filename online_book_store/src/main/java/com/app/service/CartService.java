package com.app.service;

import java.util.List;

import com.app.dto.BooksFromCartOrderDTO;

public interface CartService {
//
//    CartDTO createCart(CartDTO cartDTO);
//
//    CartDTO updateCart(Long cartId, CartDTO cartDTO);
//
//    CartDTO getCartById(Long cartId);
//
//    void deleteCart(Long cartId);

	List<BooksFromCartOrderDTO> getBooksInCart(Long userId);
	public void addToCart(Long userId, Long bookId) ;
}
