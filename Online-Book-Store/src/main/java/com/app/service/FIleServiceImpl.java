package com.app.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.web.multipart.MultipartFile;

public class FIleServiceImpl implements FileService {

	@Override
	public String uploadImage(String path, MultipartFile file) {
		// TODO Auto-generated method stub
		
		//File name 
		String name = file.getOriginalFilename();

		//full path 
		String filePath = path+File.separator+name;

		//create folder if not exist
		File f = new File(path);
		if(!f.exists()){
		f.mkdir();
		}


		//file copy
		try {
			Files.copy(file.getInputStream(), Paths.get(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return name;
	}

}
