package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Language;
import com.app.service.LanguageService;



@RestController
@RequestMapping("/languages")
@CrossOrigin(origins = "")
public class LanguageController {
	
	//Dependencies
	@Autowired
	LanguageService langService;
	
	//Method for adding a new language
	@PostMapping
	public ResponseEntity<?> addNewLanguage(@RequestBody @Valid Language language){
		System.out.println("In add new language method..!");
		return new ResponseEntity<>(langService.addLanguage(language),HttpStatus.CREATED);
	}

}
