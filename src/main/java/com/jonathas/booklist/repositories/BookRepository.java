package com.jonathas.booklist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jonathas.booklist.entities.Book;
import com.jonathas.booklist.projections.BookMinProjection;

public interface BookRepository extends JpaRepository<Book, Long> {
    
    @Query(nativeQuery = true, value = """
            SELECT books.id, books.title, books.year_of_publication, books.image_url, books.short_description, belonging.position
            FROM BOOKS
            INNER JOIN BELONGING ON  books.id = belonging.book_id
            WHERE belonging.book_list_id = :listId
            ORDER BY belonging.position
                """)
    List<BookMinProjection> searchByList(Long listId);
}
