package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
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
@Table(name = "reviews")
//@Embeddable
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reviewId;

	// Many-to-one relationship with User
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User customer;
	@ManyToOne
	@JoinColumn(name = "book_id")
	private Book book;
	private String review;
	private LocalDate reviewDate;

//	public Review() {
//		super();
//	}
//
//	public Review(Long reviewId, User customer, Book book, String review, LocalDate reviewDate) {
//		super();
//		this.reviewId = reviewId;
//		this.customer = customer;
//		this.book = book;
//		this.review = review;
//		this.reviewDate = reviewDate;
//	}
//
//
//	public Review(String review) {
//		super();
//		this.review = review;
//	}
//
//	public Long getReviewId() {
//		return reviewId;
//	}
//
//	public void setReviewId(Long reviewId) {
//		this.reviewId = reviewId;
//	}
//
//	public User getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(User customer) {
//		this.customer = customer;
//	}
//
//	public Book getBook() {
//		return book;
//	}
//
//	public void setBook(Book book) {
//		this.book = book;
//	}
//
//	public String getReview() {
//		return review;
//	}
//
//	public void setReview(String review) {
//		this.review = review;
//	}
//
//	public LocalDate getReviewDate() {
//		return reviewDate;
//	}
//
//	public void setReviewDate(LocalDate reviewDate) {
//		this.reviewDate = reviewDate;
//	}

}
