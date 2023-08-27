package com.app.dto;

import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class UserSignInDTO {
	
	@NotBlank(message = "Email can't be blank")
	@Email(message = "Invalid email format")
	private String email;
	@NotBlank
	@Length(min = 5,max=20,message = "Invalid password length")
	private String password;
	
	
	public UserSignInDTO() {
		super();
	}
	
	public UserSignInDTO(
			@NotBlank(message = "Email can't be blank") @Email(message = "Invalid email format") String email,
			@NotBlank @Length(min = 5, max = 20, message = "Invalid password length") String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
