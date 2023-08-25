package com.app.entities;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
=======
import javax.persistence.CascadeType;
>>>>>>> 7abdb8a5e2adacbda91a4179810c782ecd18b224
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
=======
import javax.persistence.OneToMany;
>>>>>>> 7abdb8a5e2adacbda91a4179810c782ecd18b224
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "carts")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cartId;

<<<<<<< HEAD
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "cart_book", joinColumns = @JoinColumn(name = "cart_id"), inverseJoinColumns = @JoinColumn(name = "book_id"))
	private List<Book> books = new ArrayList<>();
	private int totalBooks;
	private float totalPrice;
	private float discount;
	@OneToOne(mappedBy = "cart", fetch = FetchType.LAZY)
	private User user;

	public Cart() {
		super();
	}

=======
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "cart" /* , fetch = FetchType.EAGER */ )
	private List<Book> books = new ArrayList<Book>();
	private int totalBooks;
	private float totalPrice;
	private float discount;
	@OneToOne(mappedBy = "cart",fetch = FetchType.LAZY)
	private User user;
	
	public Cart() {
		super();
	}
>>>>>>> 7abdb8a5e2adacbda91a4179810c782ecd18b224
	public Cart(Long cartId, List<Book> books, int totalBooks, float totalPrice, float discount, User user) {
		super();
		this.cartId = cartId;
		this.books = books;
		this.totalBooks = totalBooks;
		this.totalPrice = totalPrice;
		this.discount = discount;
		this.user = user;
	}
<<<<<<< HEAD

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public int getTotalBooks() {
		return totalBooks;
	}

	public void setTotalBooks(int totalBooks) {
		this.totalBooks = totalBooks;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

=======
	public Long getCartId() {
		return cartId;
	}
	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public int getTotalBooks() {
		return totalBooks;
	}
	public void setTotalBooks(int totalBooks) {
		this.totalBooks = totalBooks;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
>>>>>>> 7abdb8a5e2adacbda91a4179810c782ecd18b224
}
