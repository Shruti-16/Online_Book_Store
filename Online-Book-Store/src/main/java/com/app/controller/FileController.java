package com.app.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.app.dto.FileResponse;
import com.app.service.FileService;

@RestController
@RequestMapping("/store/file")
@CrossOrigin(origins = "http://localhost:3000") // Allow requests from frontend

public class FileController {

    @Autowired
    private FileService fileService;

    @Value("${project.image}")
    private String path;

    @PostMapping("/upload")
    public ResponseEntity<FileResponse> fileUpload(@RequestParam("image") MultipartFile image) {
        String fileName = this.fileService.uploadImage(path, image);
		return new ResponseEntity<>(new FileResponse(fileName, "File Added Successfully!!!"), HttpStatus.OK);
    }
}
