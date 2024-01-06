package com.app.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ApiResponse {
	@JsonProperty
private String message;
private LocalDateTime timeStamp;

public ApiResponse(String message) {
	super();
	this.message = message;
	this.timeStamp = LocalDateTime.now();
}
}
