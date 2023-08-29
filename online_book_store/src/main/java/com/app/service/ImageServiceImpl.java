package com.app.service;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.custom_exception.ResourceNotFoundException;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class ImageServiceImpl implements ImageService {
//	@Value("${content.upload.folder}")
	private static String imageUploadPath="/online_book_store/src/main/resources"+"/newImages1/";
	// Set the actual path
//	private static String imageUploadPath1=new ClassPathResource("static/newImagesB").getFile().getAbsolutePath(); // Set the actual path
	public ImageServiceImpl()throws IOException {
		
	}
	public String saveImage(MultipartFile imageFile) throws IOException {
		String imageName = UUID.randomUUID().toString() + "_" + imageFile.getOriginalFilename();
		System.out.println(imageName);
		File imageFolder = new File(imageUploadPath);
	    if (!imageFolder.exists()) {
	        if (imageFolder.mkdirs()) {
	            System.out.println("Image upload folder created: " + imageUploadPath);
	        } else {
	            throw new IOException("Failed to create image upload folder: " + imageUploadPath);
	        }
	    }
	    System.out.println("Image Folder Exists");
		File imageFileOnServer = new File(imageUploadPath + imageName);
		FileUtils.copyInputStreamToFile(imageFile.getInputStream(), imageFileOnServer);
		return imageName;
	}
	

	@Override
	public ResponseEntity<Resource> getImage(String imageName) throws IOException {
		File imageFile = new File(imageUploadPath + imageName);
		Resource resource = new UrlResource(imageFile.toURI());

		if (resource.exists()) {
			System.out.println("Resource Found");
			return ResponseEntity.ok()
					.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
					.body(resource);
		} else {
			throw new ResourceNotFoundException("Image not found: " + imageName);
		}
	}
}
