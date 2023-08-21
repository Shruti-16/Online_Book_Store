package com.app.service;

import java.util.List;

import com.app.dto.CityByCountryIdDTO;

public interface CityByCountryIdService {
	List<CityByCountryIdDTO> getAllCountries();
	
	List<CityByCountryIdDTO> getCitiesByCountryId(Long countryId);
}
