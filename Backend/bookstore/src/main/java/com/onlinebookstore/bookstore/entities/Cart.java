package com.onlinebookstore.bookstore.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "carts")
public class Cart extends BaseEntity{
	@OneToOne
	private User user;
	@OneToMany
	private Book book;
	private Integer totalBooks;
	private Float price;
	private Float discount;
	
	
	
	

}
