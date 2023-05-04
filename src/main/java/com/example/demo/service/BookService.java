package com.example.demo.service;

import com.example.demo.repository.BookRepository;
import com.example.demo.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book) {
        log.info("adding book with parameters - "+ book.toString());
        return bookRepository.save(book);
    }

    @Cacheable(value = "book", key="#id")
    public Book getBook(long id) {
        log.info("fetching book by id from database");
        Optional<Book> book = bookRepository.findById(id);
        if (book.isPresent()) {
            return book.get();
        } else {
            return new Book();
        }
    }

    @CachePut(value = "book", key="#book.id")
    public Book updateBook(Book book) {
        bookRepository.updateAddress(book.getId(), book.getName());
        log.info("book updated with parameters - "+ book);
        return book;
    }

    @CacheEvict(value = "book", key = "#id")
    public String deleteBook(long id) {
        bookRepository.deleteById(id);
        return "Book deleted";
    }
}