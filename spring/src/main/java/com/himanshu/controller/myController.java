package com.himanshu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.himanshu.entity.Book;
import com.himanshu.repository.BookRepository;

@RestController

@RequestMapping("/")
public class myController {
	
	@Autowired
	BookRepository bookRepository;
	
	@GetMapping(path = "/")
	public String handleHomeRoute() {
		return "Hello there! Welcome to book archive";
	}
	
	@GetMapping(path = "books")
	public List<Book> fetchBooks() {

		List<Book> books = bookRepository.findAll();

		return books;
	}

	@PostMapping(path = "book/post")
	public String AddBook(@RequestBody Book b)
	{
	Book savedBook = bookRepository.save(b);
	
	if(savedBook != null)
		return "Book saved";
	else
		return "Some error occured";

	}
}
