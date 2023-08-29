package com.app.service;

import java.util.List;

import com.app.dto.BooksFromCartOrderDTO;
import com.app.entities.Cart;
import com.app.entities.User;

public interface CartService {
//
	public Cart createCartForUser(User user);
//
//    CartDTO updateCart(Long cartId, CartDTO cartDTO);
//
//    CartDTO getCartById(Long cartId);
//
//    void deleteCart(Long cartId);

	List<BooksFromCartOrderDTO> getBooksInCart(Long userId);

	public void addToCart(Long userId, Long bookId);
}
