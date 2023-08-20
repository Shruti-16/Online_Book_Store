package com.onlinebookstore.bookstore.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Entity
@Table(name = "authors")
public class Author extends BaseEntity{
	
	private String authorName;
	private String authorDescription;
	//photo blob
	private LocalDate DOB;
	
	@OneToMany(fetch = FetchType.EAGER)
	private List<Book> books= new ArrayList<>();
	
	

}
