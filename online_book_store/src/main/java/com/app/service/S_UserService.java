package com.app.service;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.entities.ApplicationUser;
import com.app.entities.SecurityRole;
import com.app.repository.S_UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class S_UserService implements UserDetailsService {

	private Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	private S_UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.info("in the user details service");
		
		UserDetails us = userRepo.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("user not valid") );
		System.out.println(	"Data fetched from db"+us.getUsername() + us.getPassword());

		log.info("Data fetched from db"+us.getUsername() + us.getPassword());
		return us;
	}
	
	

}
