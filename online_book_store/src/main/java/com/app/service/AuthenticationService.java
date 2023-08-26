package com.app.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.dto.LoginResponseDTO;
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
	AuthenticationManager authenticationManager;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private TokenService tokenService;

	public ApplicationUser registerUser(String username, String password) {
		String encodedPassword = passwordEncoder.encode(password);

		SecurityRole userRole = roleRepo.findByAuthority("USER")
				.orElseThrow(() -> new RuntimeException("User role not found"));

		Set<SecurityRole> authorities = new HashSet<>();
		authorities.add(userRole);

		return userRepo.save(new ApplicationUser(username, encodedPassword, authorities));
	}

	public LoginResponseDTO loginUser(String username, String password) {

		try {
			Authentication auth = authenticationManager
					.authenticate(new UsernamePasswordAuthenticationToken(username, password));
			
			String token  = tokenService.generateJWT(auth);

		return new LoginResponseDTO(userRepo.findByUsername(username).get(),token);
		
		} catch (AuthenticationException e) {
			return new LoginResponseDTO(null, "");
		}
		

	}

}
