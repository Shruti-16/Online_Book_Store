package com.app.service;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface ImageService {
	public String saveImage(MultipartFile imageFile) throws IOException;

	public ResponseEntity<Resource> getImage(String imageName) throws IOException;
}
