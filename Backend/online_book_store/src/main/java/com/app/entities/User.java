package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	private String userImage;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String confirmPassword;
	private LocalDate dateOfBirth;
	private String addressLine1;
	private String addressLin0e2;
	// Many-to-one relationship with City using zip code
	@ManyToOne
	@JoinColumn(name = "city", referencedColumnName = "cityId")
	private City city;
	@Pattern(regexp = "\\d{10}", message = "Phone number must be exactly 10 digits.")
	private String phoneNumber;
	private Role role;

	// One-to-many relationship with Review
	@OneToMany(mappedBy = "customer")
	private List<Review> reviews = new ArrayList<Review>();

	@OneToMany(mappedBy = "user")
	private List<Order> orders = new ArrayList<>();

	public User() {
		super();
	}

	public User(Long userId, String userImage, String firstName, String lastName, String email, String password,
			String confirmPassword, LocalDate dateOfBirth, String addressLine1, String addressLin0e2, City city,
			@Pattern(regexp = "\\d{10}", message = "Phone number must be exactly 10 digits.") String phoneNumber,
			Role role, List<Review> reviews, List<Order> orders) {
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
		this.addressLin0e2 = addressLin0e2;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.role = role;
		this.reviews = reviews;
		this.orders = orders;
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
		return addressLin0e2;
	}

	public void setAddressLin0e2(String addressLin0e2) {
		this.addressLin0e2 = addressLin0e2;
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

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}