package com.app.dto;

public class BooksFromCartOrderDTO {
	private Long bookId;
	private String bookImage;
	private String title;
	private String authorName;
	private float sellingPrice;

	public BooksFromCartOrderDTO() {
		super();
	}

	public BooksFromCartOrderDTO(Long bookId, String bookImage, String title, String authorName,
			float sellingPrice) {
		super();
		this.bookId = bookId;
		this.bookImage = bookImage;
		this.title = title;
		this.authorName = authorName;
		this.sellingPrice = sellingPrice;
	}

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

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public float getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(float sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

}
