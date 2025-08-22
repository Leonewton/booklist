package com.jonathas.booklist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jonathas.booklist.DTO.BookListDTO;
import com.jonathas.booklist.entities.BookList;
import com.jonathas.booklist.repositories.BookListRepository;

@Service
public class BookListService {

    @Autowired
    private BookListRepository bookListRepository;

    @Transactional(readOnly = true)
    public List<BookListDTO> findAll() {
        List<BookList> bookLists = bookListRepository.findAll();
        List<BookListDTO> bookListDTOs = bookLists.stream().map(BookListDTO::new).collect(Collectors.toList());
        return bookListDTOs;
    }

    @Transactional(readOnly = true)
    public BookListDTO findById(Long id) {
        BookList bookList = bookListRepository.findById(id).orElseThrow();
        return new BookListDTO(bookList);
    }
}
