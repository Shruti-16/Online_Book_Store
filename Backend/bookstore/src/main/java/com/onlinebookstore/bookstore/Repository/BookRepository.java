package com.onlinebookstore.bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinebookstore.bookstore.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
