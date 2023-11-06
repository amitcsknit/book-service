package com.amit.bookservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amit.bookservice.dto.BookRequest;
import com.amit.bookservice.model.Book;
import com.amit.bookservice.repository.BookRespository;

@Service
public class BookService {

	@Autowired
	private BookRespository bookRespository;

	public void createBook(BookRequest bookRequest) {

		Book book = new Book();
		book.setBarcode(bookRequest.getBarcode());
		book.setPrice(bookRequest.getPrice());
		book.setTitle(bookRequest.getTitle());
		book.setType(bookRequest.getType());
		bookRespository.save(book);
	}

	public List<Book> getAllBooks() {

		List<Book> bookList = bookRespository.findAll();
		return bookList;

	}

	public Optional<Book> getBookById(String id) {
		Optional<Book> book = bookRespository.findById(id);
		return book;

	}

}
