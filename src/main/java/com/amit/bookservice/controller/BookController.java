package com.amit.bookservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.amit.bookservice.dto.BookRequest;
import com.amit.bookservice.model.Book;
import com.amit.bookservice.service.BookService;

@RestController
@RequestMapping("/api/book")
public class BookController {

	@Autowired
	private BookService bookservice;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createBook(@RequestBody BookRequest productRequest) {
		bookservice.createBook(productRequest);
	}

	@GetMapping
	public List<Book> getAllBookList() {
		List<Book> lstBooks = bookservice.getAllBooks();
		return lstBooks;
	}

	@GetMapping("/{id}")
	public Optional<Book> getBookById(@PathVariable String id) {
		Optional<Book> book = bookservice.getBookById(id);
		return book;
	}

}
