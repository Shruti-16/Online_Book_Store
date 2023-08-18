package com.app.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	String uploadImage (String path, MultipartFile file);

}
