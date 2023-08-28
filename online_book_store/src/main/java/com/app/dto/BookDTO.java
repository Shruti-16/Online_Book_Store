package com.app.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.app.entities.Genre;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
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
  @Min(value = 0, message = "Marked price should not be less than 0")
	private float markedPrice;
  @Min(value = 0, message = "Selling price should not be less than 0")
  private float sellingPrice;
	private int edition;
  @Min(value = 1, message = "Stock should be greater than 1")
	private int stock;
	private Genre genre;
	public BookDTO(
			@NotBlank @Length(max = 20, min = 3, message = "Book Title lenght should be in between 3 to 20 characters.") String title,
			List<String> languageNames, String bookImage, LocalDate publicationDate,
			@NotBlank @Length(max = 20, min = 3, message = "Author Name should be in between 3 to 20 characters.") String authorName,
			@Min(value = 0, message = "Marked price should not be less than 0") float markedPrice,
			@Min(value = 0, message = "Selling price should not be less than 0") float sellingPrice, int edition,
			@Min(value = 1, message = "Stock should be greater than 1") int stock, Genre genre) {
		super();
		this.title = title;
		this.languageNames = languageNames;
		this.bookImage = bookImage;
		this.publicationDate = publicationDate;
		this.authorName = authorName;
		this.markedPrice = markedPrice;
		this.sellingPrice = sellingPrice;
		this.edition = edition;
		this.stock = stock;
		this.genre = genre;
	}
	public BookDTO() {
		super();
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
  
	

	
}
