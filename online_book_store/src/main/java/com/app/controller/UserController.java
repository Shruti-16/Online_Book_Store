package com.app.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.UserDTO;
import com.app.service.UserService;
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
    private UserService userService;

	/**
     * Add a new user to the system.
     *
     * @param userDto The UserDTO containing user data to be added.
     * @return ResponseEntity containing the added UserDTO and HTTP status code.
     */

    @PostMapping("/addNewUser")
    public ResponseEntity<UserDTO> addNewUser(@RequestBody UserDTO userDto) {
        return new ResponseEntity<UserDTO>(userService.addNewUser(userDto), HttpStatus.CREATED);
    }
    
    
    
    /**
     * Get a list of all users in the system.
     *
     * @return ResponseEntity containing the list of UserDTO objects and HTTP status code.
     */
    @GetMapping("/getAllUsers")
    public ResponseEntity<List<UserDTO>> getAllUsers(){
    	return ResponseEntity.ok(userService.getAllUsers());
    }
}