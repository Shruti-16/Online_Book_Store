package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Cart;
import com.app.entities.User;

public interface CartRepository extends JpaRepository<Cart, Long>{

	//User u;
}
