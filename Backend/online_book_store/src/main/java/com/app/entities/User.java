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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
	@JoinColumn(name = "city_zip_code", referencedColumnName = "zipCode")
	private City city;
	private String phoneNumber;
	private Role role;

	// One-to-many relationship with Review
	@OneToMany(mappedBy = "customer")
	private List<Review> reviews = new ArrayList<Review>();

	@OneToMany(mappedBy = "user")
	private List<Order> orders = new ArrayList<>();

}
