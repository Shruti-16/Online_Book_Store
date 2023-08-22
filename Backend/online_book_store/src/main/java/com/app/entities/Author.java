package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
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
@Table(name = "authors")
public class Author extends BaseEntity {
	/*
	5. Photo (blob)
	 */
	@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true, mappedBy = "author",fetch = FetchType.EAGER)
	private List<Book> books = new ArrayList<>();
	@Column(name = "author_name")
	private String name;
	private String description;
	private LocalDate dateOfBirth;

}
