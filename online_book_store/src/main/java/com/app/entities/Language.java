package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "languages")

public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long languageId;
	private String languageName;
	@ManyToMany(mappedBy = "languages")
	private List<Book> books = new ArrayList<>();
	
	
	
	public Language() {
		super();
	}
	public Language(Long languageId, String languageName, List<Book> books) {
		super();
		this.languageId = languageId;
		this.languageName = languageName;
		this.books = books;
	}
	public Long getLanguageId() {
		return languageId;
	}
	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	

}
