package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

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
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookId;

	private String bookImage;
	private String title;
	@ManyToMany
	@JoinTable(name = "book_languages", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "language_id"))
	private List<Language> languages = new ArrayList<>();

	// private Language language;
	private LocalDate publicationDate;
	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;
	private float price;
	private int edition;
	private boolean status;
	private int stock;
	@Enumerated(EnumType.STRING) // col : varchar => enum constant name
	@Column(length = 30, name = "category")
	private Genre genre;
	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL
	/* orphanRemoval = true , fetch = FetchType.EAGER */ )
	private List<Review> reviews = new ArrayList<Review>();

//	private Map<User, Review> reviews = new HashMap<>(); 
	@ManyToOne
	@JoinColumn(name = "cart_id")
	private Cart cart;
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order; // Represents the order this book belongs to
}
