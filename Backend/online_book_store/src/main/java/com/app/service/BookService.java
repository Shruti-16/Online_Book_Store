package com.app.service;

import java.util.List;

import javax.validation.Valid;

import com.app.dto.ApiResponse;
import com.app.entities.Book;

public interface BookService {

	ApiResponse addBook(@Valid Book book);

	List<Book> getAllBooks();

	ApiResponse deleteBook(Long bookId);

	Book getABook(Long bookId);

	ApiResponse updateBook(Long bookId, @Valid Book book);


}
