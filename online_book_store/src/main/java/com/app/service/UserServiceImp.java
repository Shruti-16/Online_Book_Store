package com.app.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.UserDTO;
import com.app.entities.Cart;
import com.app.entities.User;
import com.app.repository.BookRepository;
import com.app.repository.CartRepository;
import com.app.repository.UserRepository;

@Transactional
@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private BookService bookService;
	@Autowired
	private CartRepository cartRepository;


	/**
	 * Add a new user to the database.
	 *
	 * @param userDto The UserDTO containing user data to be added.
	 * @return The added UserDTO after saving to the database.
	 */

	@Override
	public UserDTO addNewUser(UserDTO userDto) {
		User user = modelMapper.map(userDto, User.class);
		Cart cart = new Cart();
		cart.setUser(user);
		user.setCart(cart);

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

	@Override
	public UserDTO updateUser(UserDTO userDto) {
		if (userDto.getUserId() == null) {
			return null;
		}
		User existingUser = userRepository.findById(userDto.getUserId()).orElse(null);
		if (existingUser != null) {
			if (userDto.getFirstName() != null) {
				existingUser.setFirstName(userDto.getFirstName());
			}
			if (userDto.getLastName() != null) {
				existingUser.setLastName(userDto.getLastName());
			}
			if (userDto.getAddressLine1() != null) {
				existingUser.setAddressLine1(userDto.getAddressLine1());
			}
			if (userDto.getAddressLin0e2() != null) {
				existingUser.setAddressLin0e2(userDto.getAddressLin0e2());
			}
			if (userDto.getCity() != null) {
				existingUser.setCity(userDto.getCity());
			}
			if (userDto.getEmail() != null) {
				existingUser.setEmail(userDto.getEmail());
			}
			if (userDto.getPhoneNumber() != null) {
				existingUser.setPhoneNumber(userDto.getPhoneNumber());
			}
			if (userDto.getPassword() != null) {
				existingUser.setPassword(userDto.getPassword());
			}
			if (userDto.getDateOfBirth() != null) {
				existingUser.setDateOfBirth(userDto.getDateOfBirth());
			}
			User updatedUser = userRepository.save(existingUser);
			return modelMapper.map(updatedUser, UserDTO.class);
		}
		return null;
	}

	@Override
	public void deleteUser(Long userId) {
		Optional<User> existingUser=userRepository.findById(userId);
		if(existingUser!=null) {
			User user=existingUser.get();
			cartRepository.deleteById(user.getCart().getCartId());
			userRepository.deleteById(userId);
		}
	}

	@Override
	public UserDTO authenticateUser(String email, String password) {
		User user=userRepository.findUserByEmail(email);
//		if(user != null && user.getPassword().equals(password)) {
//			// Authentication successful
//            // fetch and return the list of books
//			List<ResponseBookDTO> books=bookService.getAllBooks();
//			List<ResponseBookDTO> listBookDTO=books.stream().map(book -> modelMapper.map(book, ResponseBookDTO.class))
//					.collect(Collectors.toList());
//			return listBookDTO;
//		}
		if(user!=null) {
			
			return modelMapper.map(user, UserDTO.class);
		}
		return null;
	}

	@Override
    public UserDTO getUserById(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new EntityNotFoundException("User not found with id: " + userId));

        return modelMapper.map(user, UserDTO.class);
    }

}
