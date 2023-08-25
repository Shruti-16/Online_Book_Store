package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.City;

public interface CityRepository extends JpaRepository<City, Long> {
	
	String findByCityName(String name);

}
