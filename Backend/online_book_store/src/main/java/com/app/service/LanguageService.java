package com.app.service;

import javax.validation.Valid;

import com.app.dto.ApiResponse;
import com.app.entities.Language;

public interface LanguageService {

	ApiResponse addLanguage(@Valid Language language);

}
