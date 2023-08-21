package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.UserDTO;
import com.app.entities.User;
import com.app.repository.UserRepository;


@Transactional
@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ModelMapper modelMapper;

	/**
	 * Add a new user to the database.
	 *
	 * @param userDto The UserDTO containing user data to be added.
	 * @return The added UserDTO after saving to the database.
	 */

	@Override
	public UserDTO addNewUser(UserDTO userDto) {
		User user = modelMapper.map(userDto, User.class);

		User savedUser = userRepository.save(user);
		return modelMapper.map(savedUser, UserDTO.class);
	}

	/**
	 * Retrieve a list of all users from the database.
	 *
	 * @return List of UserDTO objects representing all users.
	 */

	@Override
	public List<UserDTO> getAllUsers() {
		List<User> users = userRepository.findAll();
		return users.stream().map(this::mapToUserDTO).collect(Collectors.toList());
	}

	/**
	 * Maps a User entity to a UserDTO.
	 *
	 * @param user The User entity to be mapped.
	 * @return The corresponding UserDTO.
	 */

	private UserDTO mapToUserDTO(User user) {
		UserDTO userDto = modelMapper.map(user, UserDTO.class);
		return userDto;
	}

}
