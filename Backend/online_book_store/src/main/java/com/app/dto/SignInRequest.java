package com.app.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SignInRequest {
@NotBlank(message = "Email can't be blank or null")
	private String email;
@NotBlank(message = "Password can't be blank or null")
private String password;
}
