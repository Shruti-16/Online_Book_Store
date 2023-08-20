package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.User;
import com.app.service.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
	
	//Dependencies
	@Autowired
	UserService userService;
	
	//Method to add a user
	@PostMapping
	public ResponseEntity<?> addUserDetails(@RequestBody @Valid User user){
		System.out.println("In add user details..!");
		return new ResponseEntity<>(userService.addNewUser(user),HttpStatus.CREATED);
	}
	
	//Method to remove a user
	@DeleteMapping("/{userId}")
	public ResponseEntity<?> removeUserDetails(@PathVariable Long userId){
		System.out.println("In remove user details method..!");
		return new ResponseEntity<>(userService.deleteUser(userId),HttpStatus.OK);
	}

}
