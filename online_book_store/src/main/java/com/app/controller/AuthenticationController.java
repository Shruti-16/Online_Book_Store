package com.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.LoginResponseDTO;
import com.app.dto.UserSignInDTO;
import com.app.entities.ApplicationUser;
import com.app.service.AuthenticationService;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthenticationController {

	private Logger log = LoggerFactory.getLogger(getClass());
	@Autowired
	
	private AuthenticationService authenticationService;

	@PostMapping("/registerUser")
	public ApplicationUser registerUser(@RequestBody UserSignInDTO newUser) {
		log.info("Users email = " + newUser.getUsername());
		return authenticationService.registerUser(newUser.getUsername(), newUser.getPassword());
	}

@PostMapping("/login")
public LoginResponseDTO loginUser (@RequestBody UserSignInDTO user) {
	
	return authenticationService.loginUser(user.getUsername(), user.getPassword());
}
	
	
}
