package com.app.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import com.app.entities.Genre;
import com.app.entities.Review;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.ToString;



@ToString
public class BookDTO {
	@NotBlank
	@Length(max = 20, min = 3 ,message = "Book Title lenght should be in between 3 to 20 characters.")
	private String title;
	private List<String> languageNames = new ArrayList<>();
	private String bookImage;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate publicationDate;
	@NotBlank
	@Length(max = 20,min=3 ,  message = "Author Name should be in between 3 to 20 characters.")
	private String authorName;
	@Min(value = 10, message = "price should not be less than 10")
	private float price;
	private int edition;
	@Min(value = 1, message = "Stock should be greater than 1")
	private int stock;
	private Genre genre;
	private List<Review> reviews = new ArrayList<Review>();

	public BookDTO() {
		super();
	}

	public BookDTO(String title, List<String> languageNames, String bookImage, LocalDate publicationDate,
			String authorName, float price, int edition, int stock, Genre genre, List<Review> reviews) {
		super();
		this.title = title;
		this.languageNames = languageNames;
		this.bookImage = bookImage;
		this.publicationDate = publicationDate;
		this.authorName = authorName;
		this.price = price;
		this.edition = edition;
		this.stock = stock;
		this.genre = genre;
		this.reviews = reviews;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getLanguageNames() {
		return languageNames;
	}

	public void setLanguageNames(List<String> languageNames) {
		this.languageNames = languageNames;
	}

	public String getBookImage() {
		return bookImage;
	}

	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
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

	

	

}
