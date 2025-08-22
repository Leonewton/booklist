package com.jonathas.booklist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonathas.booklist.DTO.BookDTO;
import com.jonathas.booklist.DTO.BookMinDTO;
import com.jonathas.booklist.services.BookService;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<BookMinDTO> findAll() {
         List<BookMinDTO>  books = bookService.findAll();
         return books;
    }

    @GetMapping(value = "/{id}")
    public BookDTO findById(@PathVariable Long id) {
        return bookService.findById(id);
    }
}
