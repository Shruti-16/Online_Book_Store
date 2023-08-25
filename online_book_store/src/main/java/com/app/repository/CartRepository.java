package com.app.repository;

<<<<<<< HEAD
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
=======
import org.springframework.data.jpa.repository.JpaRepository;
>>>>>>> 7abdb8a5e2adacbda91a4179810c782ecd18b224

import com.app.entities.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
<<<<<<< HEAD
	@Query("SELECT c FROM Cart c WHERE c.user.id = :userId")
	Optional<Cart> findByUserId(Long userId);
=======
>>>>>>> 7abdb8a5e2adacbda91a4179810c782ecd18b224

}
