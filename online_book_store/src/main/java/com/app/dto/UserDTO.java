package com.app.dto;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;

import com.app.entities.City;
import com.app.entities.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;




public class UserDTO {

	private Long userId;
	private String userImage;
//	@NotBlank(message = "First name can't be blank")
//	@Length(min = 4, max = 20, message = "Invalid first name!!!!!!")
	private String firstName;
//	@NotBlank(message = "Last  name can't be blank")
	private String lastName;
//	@Email(message = "Invalid email format")
	private String email;
	private String password;
	private String confirmPassword;
	private LocalDate dateOfBirth;
	private String addressLine1;
	private String addressLine2;
	private City city;
//	@Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
	private String phoneNumber;
//	@NotNull(message = "Role must be supplied")
	private Role role;
	

	public UserDTO() {
		super();
	}

	public UserDTO(Long userId, String userImage,
			@NotBlank(message = "First name can't be blank") @Length(min = 4, max = 20, message = "Invalid first name!!!!!!") String firstName,
			@NotBlank(message = "Last  name can't be blank") String lastName,
			@Email(message = "Invalid email format") String email, String password, String confirmPassword,
			LocalDate dateOfBirth, String addressLine1, String addressLin0e2, City city,
			@Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits") String phoneNumber,
			@NotNull(message = "Role must be supplied") Role role) {
		super();
		this.userId = userId;
		this.userImage = userImage;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.dateOfBirth = dateOfBirth;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLin0e2;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.role = role;
//		this.cart = cart;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
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

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLin0e2() {
		return addressLine2;
	}

	public void setAddressLin0e2(String addressLin0e2) {
		this.addressLine2 = addressLin0e2;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
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
//
//	public CartDTO getCart() {
//		return cart;
//	}
//
//	public void setCart(CartDTO cart) {
//		this.cart = cart;
//	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userImage=" + userImage + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", password=" + password + ", confirmPassword=" + confirmPassword
				+ ", dateOfBirth=" + dateOfBirth + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
				+ ", city=" + city + ", phoneNumber=" + phoneNumber + ", role=" + role + "]";
	}

	
}
