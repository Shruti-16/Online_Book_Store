package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Country;
import com.app.repository.CountryRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Country getCountryById(Long id) {
        Optional<Country> countryOptional = countryRepository.findById(id);
        return countryOptional.orElse(null);
    }
}
