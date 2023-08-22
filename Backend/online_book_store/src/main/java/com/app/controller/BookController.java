package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Book;
import com.app.service.BookService;

@RestController
@RequestMapping("/books")
@CrossOrigin(origins = "")
public class BookController {
	
	//Dependencies
	@Autowired
	BookService bookService;
	
	//Method for adding a new book
	@PostMapping
	public ResponseEntity<?> addNewBook(@RequestBody @Valid Book book){
		System.out.println("In add new book method..!");
		return new ResponseEntity<>(bookService.addBook(book), HttpStatus.CREATED);
	}
	
	//Method for getting the list of all books
	@GetMapping
	public ResponseEntity<?> getListOfBooks(){
		System.out.println("In get list of books method..!");
		return new ResponseEntity<>(bookService.getAllBooks(),HttpStatus.OK);
	}
	
	//Method for removing a book
	@DeleteMapping("/{bookId}")
	public ResponseEntity<?> removeBook(@PathVariable Long bookId){
		System.out.println("In remove book method..!");
		return new ResponseEntity<>(bookService.deleteBook(bookId), HttpStatus.OK);
	}
	
	//Method for getting details of specific book
	@GetMapping("/{bookId}")
	public ResponseEntity<?> getBookDetails(@PathVariable Long bookId){
		System.out.println("In get book details method...!");
		return new ResponseEntity<>(bookService.getABook(bookId),HttpStatus.OK);
	}
	
	//Method for updating details of a book
	@PutMapping("/{bookId}")
	public ResponseEntity<?> updateBookDetails(@PathVariable Long bookId, @RequestBody @Valid Book book){
		return new ResponseEntity<>(bookService.updateBook(bookId,book),HttpStatus.OK);
	}

}
