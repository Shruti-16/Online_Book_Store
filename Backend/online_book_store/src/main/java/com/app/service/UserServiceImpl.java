package com.app.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.ApiResponse;
import com.app.entities.User;
import com.app.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	//Dependency
	@Autowired
	UserRepository userRepo;

	@Override
	public ApiResponse addNewUser(@Valid User user) {
		return new ApiResponse("User registered with Id : "+user.getId()+" successfully..!");
	}

}
