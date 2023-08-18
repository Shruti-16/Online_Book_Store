package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "languages")
public class Language extends BaseEntity {
	@Column(name = "language_name")
	private String name;

}
