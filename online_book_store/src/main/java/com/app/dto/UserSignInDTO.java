package com.app.dto;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserSignInDTO {
	
	@NotBlank(message = "Email can't be blank")
	@Email(message = "Invalid email format")
	private String username;
	@NotBlank
	@Length(min = 5,max=20,message = "Invalid password length")
	private String password;
	
	
	public UserSignInDTO() {
		super();
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public UserSignInDTO(
			@NotBlank(message = "Email can't be blank") @Email(message = "Invalid email format") String username,
			@NotBlank @Length(min = 5, max = 20, message = "Invalid password length") String password) {
		super();
		this.username = username;
		this.password = password;
	}

	
}
