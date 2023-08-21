package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CityByCountryIdDTO;
import com.app.service.CityByCountryIdService;

@RestController
@RequestMapping("/dropdown")
public class CityByCountryIdController {
	@Autowired
	CityByCountryIdService cityByCountryIdService;
	
	@GetMapping("/countries")
	public List<CityByCountryIdDTO> getAllCountries(){
		return cityByCountryIdService.getAllCountries();
	}
	
	@GetMapping("cities/{countryId}")
	public List<CityByCountryIdDTO> getCitiesByCountryId(@PathVariable Long countryId){
		return cityByCountryIdService.getCitiesByCountryId(countryId);
	}
}
