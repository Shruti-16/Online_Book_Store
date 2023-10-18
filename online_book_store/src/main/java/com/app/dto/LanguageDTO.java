package com.app.dto;

public class LanguageDTO {

    private Long languageId;
    private String name;
	public LanguageDTO(Long languageId, String name) {
		super();
		this.languageId = languageId;
		this.name = name;
	}
	
	public LanguageDTO() {
		super();
	}

	public Long getLanguageId() {
		return languageId;
	}
	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
    
    
    
    
    

}
