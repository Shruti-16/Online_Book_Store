package com.app.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ListBookWithUserDTO;
import com.app.dto.ResponseBookDTO;
import com.app.dto.UserDTO;
import com.app.dto.UserSignInDTO;
import com.app.service.BookService;
import com.app.service.UserService;
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
    private UserService userService;
	@Autowired
	private BookService bookService;

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
    
    @GetMapping("/{userId}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long userId) {
        UserDTO userDTO = userService.getUserById(userId);
        return ResponseEntity.ok(userDTO);
    }
    
    @PatchMapping("/updateUser")
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDto) {
        UserDTO updatedUser = userService.updateUser(userDto);
        if (updatedUser != null) {
            return ResponseEntity.ok(updatedUser);
        } else {
            // Handle the case where user update fails
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @DeleteMapping("/deleteUser/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Long userId){
    	userService.deleteUser(userId);
    	return new ResponseEntity<String>("User Deleted Successfully", HttpStatus.OK);
    }
  
  
}