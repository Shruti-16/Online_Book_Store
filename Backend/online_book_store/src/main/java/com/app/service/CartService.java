package com.app.service;

import com.app.entities.Cart;

public interface CartService {
    Cart createCart(Cart cart);
    Cart updateCart(Cart cart);
    void deleteCart(Long cartId);
    Cart getCartById(Long cartId);
    // Add other methods as needed
}
