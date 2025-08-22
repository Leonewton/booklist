package com.jonathas.booklist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonathas.booklist.DTO.BookListDTO;
import com.jonathas.booklist.services.BookListService;



@RestController
@RequestMapping(value = "/lists")
public class BookListController {

    @Autowired
    private BookListService bookListService;

    @GetMapping
    public List<BookListDTO> findAll() {
        return bookListService.findAll();
    }

    @GetMapping(value = "/{id}")
    public BookListDTO findById(@PathVariable Long id) {
        return bookListService.findById(id);
    }
}
