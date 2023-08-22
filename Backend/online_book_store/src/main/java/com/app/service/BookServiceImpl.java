package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dto.ApiResponse;
import com.app.entities.Book;
import com.app.repository.BookRepository;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	//Dependency
	@Autowired
	BookRepository bookRepo;
	
	@Override
	public ApiResponse addBook(@Valid Book book) {
		System.out.println("In add book method..!");
		
		return new ApiResponse("Book  is added with id : "+book.getId()+" successfully..!");
	}

	@Override
	public List<Book> getAllBooks() {
		System.out.println("In get all books method..!");
		return bookRepo.findAll();
	}

	@Override
	public ApiResponse deleteBook(Long bookId) {
		//Book temp = boo
		bookRepo.delete(bookRepo.findById(bookId).orElseThrow(()-> new ResourceNotFoundException("Book not found..!")));
		return new ApiResponse("Book with id : "+bookId+" is removed successfully..!");
	}

	@Override
	public Book getABook(Long bookId) {
		System.out.println("In get a book method..!");
		return bookRepo.findById(bookId).orElseThrow(()-> new ResourceNotFoundException("Book not found..!"));
	}

	@Override
	public ApiResponse updateBook(Long bookId, @Valid Book book) {
		// TODO Auto-generated method stub
		return null;
	}

}
