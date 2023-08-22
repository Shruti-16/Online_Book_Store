package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.BookDTO;
import com.app.service.BookService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/books")
@CrossOrigin
public class BookController {

	@Autowired
	private BookService bookService;
	 @Autowired
	    private ModelMapper modelMapper;
	 
	@GetMapping("/getAllBooks")
	public ResponseEntity<List<BookDTO>> getAllBooks() {
		//List<BookDTO> bookDTOs = bookService.getAllBooks();
		return ResponseEntity.ok( bookService.getAllBooks());
	}
	
	@PostMapping("/addNewBook")
	public ResponseEntity<BookDTO> addNewBook(@RequestBody @Valid BookDTO newBook){
	System.out.println("Name of book ="+newBook.getTitle());
		return new ResponseEntity<BookDTO>(bookService.addNewBook(newBook), HttpStatus.CREATED);
		
	}

}
