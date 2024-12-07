package com.klef.jfsd.exam.controller;


import com.klef.jfsd.exam.model.Book;
import com.klef.jfsd.exam.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")

public class BookController {
	 @Autowired
	    private BookService bookService;

	    @PutMapping("/{id}")
	    public Book updateBook(@PathVariable("id") int bookId, @RequestBody Book book) {
	        return bookService.updateBook(bookId, book);
	    }
	}


