package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CityDTO;
import com.app.service.CityService;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/{countryId}")
    public ResponseEntity<List<CityDTO>> getCitiesByCountryId(@PathVariable Long countryId) {
        List<CityDTO> cities = cityService.getCitiesByCountryId(countryId);
        
        if (cities.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(cities);
        }
    }
}
