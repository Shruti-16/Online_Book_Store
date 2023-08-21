package com.app.service;

import java.util.List;

import com.app.dto.UserDTO;

public interface UserService {
	public UserDTO addNewUser(UserDTO userDto);

	public List<UserDTO> getAllUsers();
}
