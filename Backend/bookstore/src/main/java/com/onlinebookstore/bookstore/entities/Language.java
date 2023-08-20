package com.onlinebookstore.bookstore.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "languages")

public class Language extends BaseEntity{
	
	private String name;
	
	

}
