package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
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
@Table(name = "books")
public class Book extends BaseEntity {
	/*
	7. Image (blob)
	 */
	private String title;
	@OneToMany(fetch = FetchType.EAGER)	
	private List<Language> languages = new ArrayList<Language>();
	private LocalDate publicationDate;
	@OneToOne
	private Author author;
	private float price;
	private int edition;
	private boolean status;
	private int stock;
	@Enumerated(EnumType.STRING)
	private Genre genre;
	private Map<User, Review> reviews = new HashMap<>();
	@ManyToOne
	private Cart cart;

}
