package com.app.entities;

<<<<<<< HEAD

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
=======
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

>>>>>>> de4e2976a29e0f7d2b4f5b92cdf752a0db982ab6
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

<<<<<<< HEAD

=======
>>>>>>> de4e2976a29e0f7d2b4f5b92cdf752a0db982ab6
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "countries")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long countryId;

	/*
	 * description
	 * 
	 * @param
	 * 
	 * 
	 * 
	 * @return
	 * 
	 * @throws
	 */
	private String name;
//	@OneToMany(fetch = FetchType.EAGER)
//	private List<City> cities = new ArrayList<>();

	public Country(Long countryId, String name) {
		super();
		this.countryId = countryId;
		this.name = name;
	}

	public Country() {
		super();
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
