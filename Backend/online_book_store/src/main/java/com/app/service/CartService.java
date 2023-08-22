package com.app.service;

import javax.validation.Valid;
import com.app.entities.Cart;

public interface CartService {

	Cart addCart(@Valid Cart cart);

}
