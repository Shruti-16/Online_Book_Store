package com.app.service;

<<<<<<< HEAD
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
=======
import com.app.dto.CartDTO;

public interface CartService {

    CartDTO createCart(CartDTO cartDTO);

    CartDTO updateCart(Long cartId, CartDTO cartDTO);

    CartDTO getCartById(Long cartId);

    void deleteCart(Long cartId);
>>>>>>> 7abdb8a5e2adacbda91a4179810c782ecd18b224
}
