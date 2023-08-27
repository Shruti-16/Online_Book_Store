package com.app.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
=======
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

>>>>>>> de4e2976a29e0f7d2b4f5b92cdf752a0db982ab6
import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;

<<<<<<< HEAD
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

=======
>>>>>>> de4e2976a29e0f7d2b4f5b92cdf752a0db982ab6
public class ResponseBookDTO {
	  @NotBlank
	    @Length(max = 10, min = 3, message = "Book Title length should be between 5 to 10 characters.")
	    private String title;

	    private List<String> languageNames = new ArrayList<>();

	    private String bookImage;

	    @NotNull
	    @JsonFormat(pattern = "yyyy-MM-dd")
	    private LocalDate publicationDate;

	    @NotBlank
	    @Length(max = 15, min = 3, message = "Author Name should be between 3 to 15 characters.")
	    private String authorName;

	    @Min(value = 0, message = "Marked price should not be less than 0")
	    private float markedPrice;

	    @Min(value = 0, message = "Selling price should not be less than 0")
	    private float sellingPrice;

	    private int edition;

	    @Min(value = 1, message = "Stock should be greater than 1")
	    private int stock;

	    private String genre;

	    private List<String> reviews = new ArrayList<>();

	    public ResponseBookDTO(
	            @NotBlank @Length(max = 10, min = 3, message = "Book Title length should be 5 to 10 characters.") String title,
	             List<String> languageNames, String bookImage, @NotNull LocalDate publicationDate,
	            @NotBlank @Length(max = 15, min = 3, message = "Author Name should be between 3 to 15 characters.") String authorName,
	            @Min(value = 0, message = "Marked price should not be less than 0") float markedPrice,
	            @Min(value = 0, message = "Selling price should not be less than 0") float sellingPrice, int edition,
	            @Min(value = 1, message = "Stock should be greater than 1") int stock, String genre,
	            List<String> reviews) {
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
	        this.reviews = reviews;
	    }

	    public ResponseBookDTO() {
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

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public List<String> getReviews() {
			return reviews;
		}

		public void setReviews(List<String> reviews) {
			this.reviews = reviews;
		}

	


		

}
