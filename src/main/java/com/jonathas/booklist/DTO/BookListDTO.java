package com.jonathas.booklist.DTO;

import com.jonathas.booklist.entities.BookList;

public class BookListDTO {
    private Long id;
    private String name;

    public BookListDTO(BookList bookList) {
        this.id = bookList.getId();
        this.name = bookList.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
