package com.jonathas.booklist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathas.booklist.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    

}
