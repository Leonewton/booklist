package com.jonathas.booklist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonathas.booklist.DTO.BookListDTO;
import com.jonathas.booklist.DTO.BookMinDTO;
import com.jonathas.booklist.DTO.ReplacementDTO;
import com.jonathas.booklist.services.BookListService;
import com.jonathas.booklist.services.BookService;



@RestController
@RequestMapping(value = "/lists")
public class BookListController {

    @Autowired
    private BookListService bookListService;

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<BookListDTO> findAll() {
        return bookListService.findAll();
    }

    @GetMapping(value = "/{bookListId}")
    public BookListDTO findById(@PathVariable Long bookListId) {
        return bookListService.findById(bookListId);
    }

    @GetMapping(value = "/{bookListId}/books")
    public List<BookMinDTO> findBooksByList(@PathVariable Long bookListId) {
         List<BookMinDTO>  books = bookService.findByList(bookListId);
         return books;
    }

    @PostMapping(value = "/{bookListId}/replacement")
    public void move(@PathVariable Long bookListId, @RequestBody ReplacementDTO body) {
        bookListService.moveBook(bookListId, body.getSourcePosition(), body.getDestinationPosition());
    }
}
