package com.app.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.entities.ApplicationUser;
import com.app.entities.SecurityRole;
import com.app.repository.S_UserRepository;
import com.app.repository.SecurityRoleRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AuthenticationService {

	@Autowired
	private S_UserRepository userRepo;
	
	@Autowired
	private SecurityRoleRepository roleRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public ApplicationUser registerUser(String username, String password) {
	    String encodedPassword = passwordEncoder.encode(password);

	    SecurityRole userRole = roleRepo.findByAuthority("USER")
	            .orElseThrow(() -> new RuntimeException("User role not found"));

	    Set<SecurityRole> authorities = new HashSet<>();
	    authorities.add(userRole);

	    return userRepo.save(new ApplicationUser(username, encodedPassword, authorities));
	}
	
	
}
