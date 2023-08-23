package com.app.dto;

import com.app.entities.Genre;

public class ListBookDTO {
	private String title;
	private String bookImage;
	private Genre genre;
	private float price;

	public ListBookDTO() {
		super();
	}

	public ListBookDTO(String title, String bookImage, Genre genre, float price) {
		super();
		this.title = title;
		this.bookImage = bookImage;
		this.genre = genre;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBookImage() {
		return bookImage;
	}

	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ListBookDTO [title=" + title + ", bookImage=" + bookImage + ", genre=" + genre + ", price=" + price
				+ "]";
	}

}
