package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.BookDTO;
import com.app.entities.Book;
import com.app.entities.Language;
import com.app.repository.BookRepository;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private ModelMapper modelMapper;

	// to fetch all the books from the book table
	public List<BookDTO> getAllBooks() {
		List<Book> books = bookRepository.findAllWithLanguages();
		return books.stream().map(this::convertToDTO).collect(Collectors.toList());
	}

	private BookDTO convertToDTO(Book book) {
		// Initialize the languages collection
		Hibernate.initialize(book.getLanguages());

		System.out.println("Number of languages: " + book.getLanguages().size()); // Debugging

		BookDTO bookDTO = modelMapper.map(book, BookDTO.class);
		List<String> languageNames = book.getLanguages().stream().map(Language::getName).collect(Collectors.toList());
		bookDTO.setLanguageNames(languageNames);
		return bookDTO;
	}

	// To add new Book object in the book table
	@Override
	public BookDTO addNewBook(BookDTO newBook) {
		Book book = modelMapper.map(newBook, Book.class);
		Book savedBook = bookRepository.save(book);
		BookDTO existingBook = modelMapper.map(savedBook, BookDTO.class);
		return existingBook;
	}

	// to fetch all the books having provided title
	@Override
	public List<BookDTO> getBooksByTitle(String title) {
		List<Book> books = bookRepository.findByTitleContainingIgnoreCase(title);
		return books.stream().map(book -> modelMapper.map(book, BookDTO.class)).collect(Collectors.toList());
	}

	// to delete the book by id
	@Override
	public String removeBookById(Long bookId) {
		// Check if the book with the given ID exists
		if (bookRepository.existsById(bookId)) {
			bookRepository.deleteById(bookId);
			return "Book with ID " + bookId + " has been removed.";
		} else {
			return "Book with ID " + bookId + " does not exist.";
		}
	}

}
