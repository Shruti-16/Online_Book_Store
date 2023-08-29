package com.app.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.app.dto.BookDTO;
import com.app.dto.ResponseBookDTO;

public interface BookService {

	List<ResponseBookDTO> getAllBooks();

	BookDTO addNewBook(BookDTO newBook, MultipartFile imageFile) throws IOException;

	List<ResponseBookDTO> getBooksByTitle(String title);

	String removeBookById(Long bookId);

	ResponseBookDTO findBookById(Long bookId);

	BookDTO updateBook(Long bookId, BookDTO updatedBookDTO);

}
