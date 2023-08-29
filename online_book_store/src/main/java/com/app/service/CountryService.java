package com.app.service;

import java.util.List;

import com.app.entities.Country;

public interface CountryService {

    List<Country> getAllCountries();

    Country getCountryById(Long id);
}
