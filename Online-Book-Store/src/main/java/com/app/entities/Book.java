package com.app.entities;

import java.time.LocalDate;

public class Book extends BaseEntity {
	
	private  Integer bookId;
	private String title;
	private Language  language;
	private LocalDate publicationDate;
	private Author author;
	private float price ;
	private int edition;
	private boolean status;
	private int stock;
	private Genre genre;
}
