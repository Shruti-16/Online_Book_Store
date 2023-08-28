package com.app.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dto.ApiResponse;
import com.app.entities.Book;
import com.app.repository.BookRepository;

import jakarta.annotation.PostConstruct;

@Service
@Transactional
public class ImageHandlingServiceImpl implements ImageHandlingService {

	 @Value("${content.upload.folder:D:/BookImages}")
	    private String folderName;

	@Autowired
	private BookRepository bookRepo;

	private Logger log = LoggerFactory.getLogger(getClass());

	
	@PostConstruct
	public void myInit() {
		log.info("in myInit " + folderName);
		File path = new File(folderName);
		if (!path.exists()) {
			log.info("creating images folder...");
			path.mkdirs();
		} else
			log.info("folder alrdy exists....");
	}

	@Override
	public ApiResponse uploadImage(Long bookId, MultipartFile imageFile) throws IOException {

		Book book = bookRepo.findById(bookId).orElseThrow(
				() -> new ResourceNotFoundException("Invalid Book Id : Image Uploading failed!!!!!!!!"));
	
		String targetPath = folderName + File.separator + imageFile.getOriginalFilename();
		log.info(targetPath);
		Files.copy(imageFile.getInputStream(), Paths.get(targetPath), StandardCopyOption.REPLACE_EXISTING);
	
		book.setBookImage(targetPath); 
		return new ApiResponse("Image Uploaded successfully!");
	}

	@Override
	public byte[] serveImage(Long bookId) throws IOException {
		Book book = bookRepo.findById(bookId)
				.orElseThrow(() -> new ResourceNotFoundException("Invalid Book Id : Image Download failed!!!!!!!!"));
		String path = book.getBookImage() ;
		if (path == null)
			throw new ResourceNotFoundException("Image does not exist !!!!!");
		return Files.readAllBytes(Paths.get(path));

	}

}
