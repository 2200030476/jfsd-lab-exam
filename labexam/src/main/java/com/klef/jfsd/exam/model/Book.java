package com.klef.jfsd.exam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

public class Book {
	 @Id
	    private int bookId;
	    private String title;
	    private String author;
	    private String genre;
	    private double price;
	    private int publishedYear;

	    
	    public int getBookId() {
	        return bookId;
	    }

	    public void setBookId(int bookId) {
	        this.bookId = bookId;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public String getGenre() {
	        return genre;
	    }

	    public void setGenre(String genre) {
	        this.genre = genre;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public int getPublishedYear() {
	        return publishedYear;
	    }

	    public void setPublishedYear(int publishedYear) {
	        this.publishedYear = publishedYear;
	    }
	}


