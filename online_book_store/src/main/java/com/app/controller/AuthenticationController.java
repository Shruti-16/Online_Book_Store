package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.UserSignInDTO;
import com.app.entities.ApplicationUser;
import com.app.service.AuthenticationService;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthenticationController {

@Autowired
private AuthenticationService authenticationService;

@PostMapping("/registerUser")
public ApplicationUser registerUser(@RequestBody UserSignInDTO newUser) {
	return authenticationService.registerUser(newUser.getEmail(), newUser.getPassword());
}
	
}
