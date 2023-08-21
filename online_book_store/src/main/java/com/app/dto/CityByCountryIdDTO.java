package com.app.dto;

public class CityByCountryIdDTO {
	private Long Id;
	private String name;

	public CityByCountryIdDTO(Long id, String name) {
		super();
		Id = id;
		this.name = name;
	}

	public CityByCountryIdDTO() {
		super();
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
