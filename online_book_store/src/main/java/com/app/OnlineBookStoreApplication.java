package com.app;

import java.util.HashSet;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.app.entities.ApplicationUser;
import com.app.entities.SecurityRole;
import com.app.repository.S_UserRepository;
import com.app.repository.SecurityRoleRepository;

@SpringBootApplication
@EntityScan("com.app.entities")

public class OnlineBookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineBookStoreApplication.class, args);
	}
	@Bean // equivalent to <bean id ..../> in xml file
	public ModelMapper mapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}
	
	@Bean
	CommandLineRunner run(SecurityRoleRepository roleRepository , S_UserRepository userRepository , PasswordEncoder password) {
		
		
		return args ->{
			
			if(roleRepository.findByAuthority("ADMIN").isPresent())return;
			
			SecurityRole adminRole = roleRepository.save(new SecurityRole("ADMIN"));
			roleRepository.save(new SecurityRole("USER"));
			
			Set<SecurityRole> roles = new HashSet<>();
			roles.add(adminRole);
			ApplicationUser admin = new ApplicationUser( "admin", password.encode("password"), roles);
		
			userRepository.save(admin);
		
		};
		
	}
	
	

}
