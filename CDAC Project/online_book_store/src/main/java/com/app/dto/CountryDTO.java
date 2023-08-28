package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class CountryDTO {
    private Long countryId;
    private String name;
	public CountryDTO(Long countryId, String name) {
		super();
		this.countryId = countryId;
		this.name = name;
	}
	public CountryDTO() {
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
	@Override
	public String toString() {
		return "CountryDTO [countryId=" + countryId + ", name=" + name + "]";
	}
    
    
    
}
