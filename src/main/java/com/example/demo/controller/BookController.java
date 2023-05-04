package com.example.demo.controller;

import com.example.demo.service.BookService;
import com.example.demo.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/get/{id}")
    public Book getBook(@PathVariable long id){
        return bookService.getBook(id);
    }

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @PutMapping("/update")
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable long id){
        return bookService.deleteBook(id);
    }
}
