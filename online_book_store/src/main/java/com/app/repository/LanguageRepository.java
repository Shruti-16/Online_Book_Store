package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Language;
@Repository 
public interface LanguageRepository extends JpaRepository<Language , Long> {

	List<Language> findByNameIn(List<String> languageNames);

}
