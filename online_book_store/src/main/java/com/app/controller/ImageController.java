package com.app.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.service.ImageService;

@RestController
@RequestMapping("/images")
public class ImageController {
	@Autowired
	private ImageService imageService;

//    private final String imageUploadPath = "images/"; // Set the actual path

    @GetMapping("/serve/{imageName:.+}")
    public ResponseEntity<Resource> getImage(@PathVariable String imageName) throws IOException {
    	try {
            return imageService.getImage(imageName);
        } catch (IOException e) {
            return ResponseEntity.notFound().build();
        }
    }
    
    
    @PostMapping("/upload")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
        try {
            String imageName = imageService.saveImage(file);
            return ResponseEntity.ok("Image uploaded successfully: " + imageName);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Image upload failed.");
        }
    }
}
