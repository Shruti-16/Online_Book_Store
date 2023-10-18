
package com.app.dto;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;

import com.app.entities.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class AdminDTO {
	private Long userId;
	@NotBlank(message = "First name can't be blank")
	@Length(min = 4, max = 6, message = "Invalid first name!!!!!!")
	private String firstName;
	@NotBlank(message = "Last  name can't be blank")
	private String lastName;
	@Email(message = "Invalid email format")
	private String email;
	private String password;
	private String confirmPassword;
	private LocalDate dateOfBirth;

	private String address;
	private String city;
	@Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
	private String phoneNumber;
	
	
	 public AdminDTO() {
		 super();
	}

	public AdminDTO(
			@NotBlank(message = "First name can't be blank") @Length(min = 4, max = 20, message = "Invalid first name!!!!!!") String firstName,
			@NotBlank(message = "Last  name can't be blank") String lastName,
			@Email(message = "Invalid email format") String email, String password, String confirmPassword,
			LocalDate dateOfBirth, String address, String city,
			@Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits") String phoneNumber, Role role) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.dateOfBirth = dateOfBirth;

		this.address = address;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.role = role;
	}

public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	private Role role;
	


}