package com.app.service;

import javax.validation.Valid;

import com.app.dto.ApiResponse;
import com.app.entities.User;

public interface UserService {

	ApiResponse addNewUser(@Valid User user);

}
