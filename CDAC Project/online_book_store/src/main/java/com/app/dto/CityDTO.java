package com.app.dto;

public class CityDTO {
    private Long cityId;
    private String cityName;
    private String zipCode;
	public CityDTO(Long cityId, String cityName, String zipCode) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.zipCode = zipCode;
	}
	public CityDTO() {
		super();
	}
	@Override
	public String toString() {
		return "CityDTO [cityId=" + cityId + ", cityName=" + cityName + ", zipCode=" + zipCode + "]";
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
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}



}
