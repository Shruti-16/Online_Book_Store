package com.app.entities;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
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
	private Language language;
	private LocalDate publicationDate;
	private Author author;
	private float price;
	private int edition;
	private boolean status;
	private int stock;
	private Genre genre;
	private Map<User, Review> reviews = new HashMap<>(); 

}
