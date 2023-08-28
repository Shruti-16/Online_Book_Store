package com.app.service;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.CartDTO;
import com.app.entities.Cart;
import com.app.repository.CartRepository;

@Transactional
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CartDTO createCart(CartDTO cartDTO) {
        Cart cart = modelMapper.map(cartDTO, Cart.class);
        Cart savedCart = cartRepository.save(cart);
        return modelMapper.map(savedCart, CartDTO.class);
    }

    @Override
    public CartDTO updateCart(Long cartId, CartDTO cartDTO) {
        Cart existingCart = cartRepository.findById(cartId).orElse(null);
        
        if (existingCart != null) {
            existingCart.setTotalBooks(cartDTO.getTotalBooks());
            existingCart.setTotalPrice(cartDTO.getTotalPrice());
            existingCart.setDiscount(cartDTO.getDiscount());
            
            Cart updatedCart = cartRepository.save(existingCart);
            return modelMapper.map(updatedCart, CartDTO.class);
        } else {
            return null; // Handle cart not found case
        }
    }

    @Override
    public CartDTO getCartById(Long cartId) {
        Cart cart = cartRepository.findById(cartId).orElse(null);
        
        if (cart != null) {
            return modelMapper.map(cart, CartDTO.class);
        } else {
            return null; // Handle cart not found case
        }
    }

    @Override
    public void deleteCart(Long cartId) {
        cartRepository.deleteById(cartId);
    }
}