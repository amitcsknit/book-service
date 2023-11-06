package com.amit.bookservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.amit.bookservice.model.Book;

@Repository
public interface BookRespository extends MongoRepository<Book, String> {

}
