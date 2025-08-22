package com.jonathas.booklist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathas.booklist.entities.BookList;

public interface BookListRepository extends JpaRepository<BookList, Long> {


}
