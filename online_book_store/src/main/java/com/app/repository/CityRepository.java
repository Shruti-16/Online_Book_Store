package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.entities.City;
@Repository
public interface CityRepository extends JpaRepository<City, Long>{

//	List<City> findByCountryCountryId(Long countryId);
	@Query("SELECT c FROM City c WHERE c.country.countryId = :countryId")
    List<City> findCityByCountryId(@Param("countryId") Long countryId);

}
