package com.jonathas.booklist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jonathas.booklist.DTO.BookDTO;
import com.jonathas.booklist.DTO.BookMinDTO;
import com.jonathas.booklist.entities.Book;
import com.jonathas.booklist.repositories.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Transactional(readOnly = true)
    public List<BookMinDTO> findAll() {
        List<Book> books = bookRepository.findAll();
        List<BookMinDTO> bookMinDTOs = books.stream().map(BookMinDTO::new).collect(Collectors.toList());
        return bookMinDTOs;
    }

    @Transactional(readOnly = true)
    public BookDTO findById(Long id) {
        Book book = bookRepository.findById(id).orElseThrow();
        return new BookDTO(book);
    }
}
