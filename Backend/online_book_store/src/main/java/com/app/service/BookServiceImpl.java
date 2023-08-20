package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.Book;
import com.app.repository.BookRepository;

@Service
@Transactional
public class BookServiceImpl  implements BookService {
	
	@Autowired
	private  BookRepository bookRepo;

	@Override
	public List<Book> getAllBooks() {
		
		return bookRepo.findAll();
	}

	@Override
	public Book addBook(Book book) {
		
		return bookRepo.save(book);
	}
	
	

}
