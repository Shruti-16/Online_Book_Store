package com.app.service;

import java.util.List;

import com.app.dto.ListBookDTO;
import com.app.dto.UserDTO;

public interface UserService {
	public UserDTO addNewUser(UserDTO userDto);

	public List<UserDTO> getAllUsers();
	
	public UserDTO updateUser(UserDTO userDto);

	public void deleteUser(Long userId);
	
	public List<ListBookDTO> authenticateUser(String email, String password);
}
