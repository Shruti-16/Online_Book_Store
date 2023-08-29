package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.City;
import com.app.repository.CityRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> getCitiesByCountryId(Long countryId) {
        return cityRepository.findByCountryCountryId(countryId);
    }
}
