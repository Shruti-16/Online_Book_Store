package com.app.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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
public class User extends BaseEntity {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String confirmPassword;
	private LocalDate dateOfBirth;
	private String addressLine1;
	private String addressLine2;
	@OneToOne
	private City city;
	private String phoneNumber;
	private Role role;
	@OneToMany(fetch = FetchType.EAGER)
	private List<Review> reviews;

}
