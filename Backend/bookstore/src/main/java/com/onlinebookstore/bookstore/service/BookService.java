package com.onlinebookstore.bookstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onlinebookstore.bookstore.entities.Book;

@Service
public interface BookService {

	List<Book> getAllBooks();
	


	
	
}
