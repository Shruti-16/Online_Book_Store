package com.app.service;

import com.app.dto.CartDTO;

public interface CartService {

    CartDTO createCart(CartDTO cartDTO);

    CartDTO updateCart(Long cartId, CartDTO cartDTO);

    CartDTO getCartById(Long cartId);

    void deleteCart(Long cartId);
}
