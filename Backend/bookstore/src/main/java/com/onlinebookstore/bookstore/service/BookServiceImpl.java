package com.onlinebookstore.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onlinebookstore.bookstore.Repository.BookRepository;
import com.onlinebookstore.bookstore.entities.Book;

@Service
@Transactional
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository bookRepo;

	@Override
	public List<Book> getAllBooks() {
		
		return bookRepo.findAll();
	}

}
