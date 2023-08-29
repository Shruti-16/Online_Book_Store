package com.app.service;

import com.app.entities.City;

import java.util.List;

public interface CityService {

    List<City> getCitiesByCountryId(Long countryId);
}
