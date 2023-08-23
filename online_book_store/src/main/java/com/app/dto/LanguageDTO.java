package com.app.dto;

public class LanguageDTO {

    private Long id;
    private String name;
	public LanguageDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public LanguageDTO() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    
    
    
    

}
