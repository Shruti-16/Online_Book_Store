package com.app.service;

import java.util.List;
import java.util.stream.Collectors;



import org.hibernate.Hibernate;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.BookDTO;
import com.app.entities.Book;
import com.app.entities.Language;
import com.app.repository.BookRepository;


@Service
@org.springframework.transaction.annotation.Transactional
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;
	
    @Autowired
    private ModelMapper modelMapper;

    public List<BookDTO> getAllBooks() {
        List<Book> books = bookRepository.findAllWithLanguages();
        return books.stream()
            .map(this::convertToDTO)
            .collect(Collectors.toList());
    }

    private BookDTO convertToDTO(Book book) {
        // Initialize the languages collection
        Hibernate.initialize(book.getLanguages());
        
        System.out.println("Number of languages: " + book.getLanguages().size()); // Debugging
        
        BookDTO bookDTO = modelMapper.map(book, BookDTO.class);
        List<String> languageNames = book.getLanguages().stream()
            .map(Language::getName)
            .collect(Collectors.toList());
        bookDTO.setLanguageNames(languageNames);
        // Set other fields as needed
        return bookDTO;
    }

	@Override
	public BookDTO addNewBook(BookDTO newBook) {
		Book book = modelMapper.map(newBook, Book.class);
		Book savedBook = bookRepository.save(book);
		BookDTO existingBook = modelMapper.map(savedBook, BookDTO.class);

		return existingBook;
	}



}


