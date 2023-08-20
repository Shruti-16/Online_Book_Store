package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Book;
import com.app.service.BookService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@PostMapping("/books")
	public ResponseEntity<?> addBook(@RequestBody Book book ){
		
	
			return new ResponseEntity<> (bookService.addBook(book) , HttpStatus.CREATED);
		
		
	}

}
