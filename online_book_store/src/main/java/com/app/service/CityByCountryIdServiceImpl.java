package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.CityByCountryIdDTO;
import com.app.entities.City;
import com.app.entities.Country;
import com.app.repository.CityRepository;
import com.app.repository.CountryRepository;

@Service
@Transactional
public class CityByCountryIdServiceImpl implements CityByCountryIdService {
	@Autowired
	private CountryRepository countryRepository;
	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<CityByCountryIdDTO> getAllCountries() {
		// TODO Auto-generated method stub
		List<Country> countries = countryRepository.findAll();
		return countries.stream().map(country -> new CityByCountryIdDTO(country.getCountryId(), country.getName()))
				.collect(Collectors.toList());
	}

	@Override
	public List<CityByCountryIdDTO> getCitiesByCountryId(Long countryId) {
		List<City> cities = cityRepository.findCityByCountryId(countryId);
		return cities.stream().map(city -> new CityByCountryIdDTO(city.getCityId(), city.getCityName()))
				.collect(Collectors.toList());
	}

}
