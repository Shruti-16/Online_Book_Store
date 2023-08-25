package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
<<<<<<< HEAD
import javax.persistence.OneToMany;
import javax.persistence.Table;
=======
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.annotations.BatchSize;

import com.fasterxml.jackson.annotation.JsonIgnore;
>>>>>>> 7abdb8a5e2adacbda91a4179810c782ecd18b224

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
<<<<<<< HEAD
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
=======
	@ManyToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
>>>>>>> 7abdb8a5e2adacbda91a4179810c782ecd18b224
	@JoinTable(name = "book_languages", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "language_id"))
	private List<Language> languages = new ArrayList<>();
	private LocalDate publicationDate;
	private String authorName;
<<<<<<< HEAD

	private int edition;

	@Column(length = 30) // Use a unique name for the column
	private boolean isAvailable = true;
	private int stock;
	@Enumerated(EnumType.STRING)
	@Column(length = 30, name = "genre") // Use a unique name for the column
	private Genre genre;
	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<Review> reviews = new ArrayList<Review>();
	@ManyToMany(mappedBy = "books", fetch = FetchType.LAZY)
	private List<Cart> carts = new ArrayList<>();
//	@ManyToOne
//	@JoinColumn(name = "order_id")
//	private Order order; // Represents the order this book belongs to

	private float markedPrice;
	private float sellingPrice;

=======
	
	private int edition;
	
	    @Column(length = 30)  // Use a unique name for the column
	private boolean isAvailable = true;
	private int stock;
	@Enumerated(EnumType.STRING)
    @Column(length = 30, name = "genre")  // Use a unique name for the column
    private Genre genre;
	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<Review> reviews = new ArrayList<Review>();
	@ManyToOne
	@JoinColumn(name = "cart_id")
	private Cart cart;
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order; // Represents the order this book belongs to
	
	private float markedPrice;
	  private float sellingPrice;
	
>>>>>>> 7abdb8a5e2adacbda91a4179810c782ecd18b224
	public Book() {
		super();
	}

<<<<<<< HEAD
	public Book(Long bookId, String bookImage, String title, List<Language> languages, LocalDate publicationDate,
			String authorName, int edition, boolean isAvailable, int stock, Genre genre, List<Review> reviews,
			List<Cart> carts, float markedPrice, float sellingPrice) {
=======

	public Book(Long bookId, String bookImage, String title, List<Language> languages, LocalDate publicationDate,
			String authorName, int edition, boolean isAvailable, int stock, Genre genre, List<Review> reviews,
			Cart cart, Order order, float markedPrice, float sellingPrice) {
>>>>>>> 7abdb8a5e2adacbda91a4179810c782ecd18b224
		super();
		this.bookId = bookId;
		this.bookImage = bookImage;
		this.title = title;
		this.languages = languages;
		this.publicationDate = publicationDate;
		this.authorName = authorName;
		this.edition = edition;
		this.isAvailable = isAvailable;
		this.stock = stock;
		this.genre = genre;
		this.reviews = reviews;
<<<<<<< HEAD
		this.carts = carts;
//		this.order = order;
=======
		this.cart = cart;
		this.order = order;
>>>>>>> 7abdb8a5e2adacbda91a4179810c782ecd18b224
		this.markedPrice = markedPrice;
		this.sellingPrice = sellingPrice;
	}

<<<<<<< HEAD

	public Book(Long bookId, String title, String bookImage, float sellingPrice, Genre genre, int edition, String authorName) {
		// TODO Auto-generated constructor stub
		this.bookId = bookId;
		this.bookImage = bookImage;
		this.title = title;
		this.edition = edition;
		this.genre = genre;
		this.authorName = authorName;
	}

=======
>>>>>>> 7abdb8a5e2adacbda91a4179810c782ecd18b224
	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookImage() {
		return bookImage;
	}

	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public LocalDate getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
<<<<<<< HEAD
	
	

//	public Cart getCart() {
//		return cart;
//	}
//
//	public void setCart(Cart cart) {
//		this.cart = cart;
//	}

//	public Order getOrder() {
//		return order;
//	}
//
//	public void setOrder(Order order) {
//		this.order = order;
//	}

	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
=======

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
>>>>>>> 7abdb8a5e2adacbda91a4179810c782ecd18b224
	}

	public float getMarkedPrice() {
		return markedPrice;
	}

	public void setMarkedPrice(float markedPrice) {
		this.markedPrice = markedPrice;
	}

	public float getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(float sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
<<<<<<< HEAD

=======
	
	
	
	
>>>>>>> 7abdb8a5e2adacbda91a4179810c782ecd18b224
}
