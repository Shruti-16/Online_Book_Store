package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.City;
@Repository 
public interface CityRepository extends JpaRepository<City, Long> {
    List<City> findByCountry_CountryId(Long countryId);
}