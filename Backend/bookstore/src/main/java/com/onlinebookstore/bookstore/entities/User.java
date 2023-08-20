package com.onlinebookstore.bookstore.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Users")

public class User extends BaseEntity{
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String confirmPassword;
	private Gender gender;
	private LocalDate dateOfBirth;
	private String addressLine1;
	private String addressLine2;
	@OneToOne
	private City city;
	private String phoneNumber;
	private Role role;

}
