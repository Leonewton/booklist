package com.jonathas.booklist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonathas.booklist.DTO.BookMinDTO;
import com.jonathas.booklist.entities.Book;
import com.jonathas.booklist.repositories.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<BookMinDTO> findAll() {
        List<Book> books = bookRepository.findAll();
        List<BookMinDTO> bookMinDTOs = books.stream().map(BookMinDTO::new).collect(Collectors.toList());
        return bookMinDTOs;
    }
}
