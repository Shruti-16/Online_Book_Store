package com.app.service;

import java.util.List;

import com.app.dto.BookDTO;
import com.app.entities.Book;

public interface BookService {

	List<BookDTO> getAllBooks();
	BookDTO addNewBook(BookDTO newBook);
}
