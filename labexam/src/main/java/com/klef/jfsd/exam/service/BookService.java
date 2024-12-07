package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Book;
import com.klef.jfsd.exam.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

public class BookService {
	  @Autowired
	    private BookRepository bookRepository;

	    public Book updateBook(int bookId, Book book) {
	        Optional<Book> existingBook = bookRepository.findById(bookId);
	        if (existingBook.isPresent()) {
	            Book updatedBook = existingBook.get();
	            updatedBook.setTitle(book.getTitle());
	            updatedBook.setAuthor(book.getAuthor());
	            updatedBook.setGenre(book.getGenre());
	            updatedBook.setPrice(book.getPrice());
	            updatedBook.setPublishedYear(book.getPublishedYear());
	            return bookRepository.save(updatedBook);
	        } else {
	            throw new RuntimeException("Book not found with ID: " + bookId);
	        }
	    }
	}

