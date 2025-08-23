package com.jonathas.booklist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.jonathas.booklist.entities.BookList;

public interface BookListRepository extends JpaRepository<BookList, Long> {

    @Modifying
    @Query(nativeQuery = true, value = "UPDATE belonging SET position = :newPosition WHERE book_list_id = :bookListId AND book_id = :bookId")
    void updateBelongingPosition(Long bookListId, Long bookId, Integer newPosition);

}
