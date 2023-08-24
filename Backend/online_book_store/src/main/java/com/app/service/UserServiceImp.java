package com.app.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.User;
import com.app.repository.UserRepository;
@Transactional
@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Override
	public User addNewUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

}
