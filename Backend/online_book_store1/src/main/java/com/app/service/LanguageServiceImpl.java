package com.app.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.ApiResponse;
import com.app.entities.Language;
import com.app.repository.LanguageRepository;

@Service
@Transactional
public class LanguageServiceImpl implements LanguageService {
	
	//Dependency
	@Autowired
	LanguageRepository langRepo;

	@Override
	public ApiResponse addLanguage(@Valid Language language) {
		System.out.println("In add language method..!");
		langRepo.save(language);
		return new ApiResponse("Language is added with the id : "+language.getId()+" successfully..!");
	}

}
