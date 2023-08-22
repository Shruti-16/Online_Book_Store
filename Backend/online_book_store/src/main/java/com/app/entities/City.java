package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "cities")
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cityId;
	private String cityName;
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;
	@Column(unique = false)
	private String zipCode;

	public City() {
		super();
	}

	public City(Long cityId, String cityName, Country country, String zipCode) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.country = country;
		this.zipCode = zipCode;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
