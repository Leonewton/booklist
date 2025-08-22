package com.jonathas.booklist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "book_list_id")
    private BookList bookList;
    
    public BelongingPK() {
    }

    public BelongingPK(Book book, BookList bookList) {
        this.book = book;
        this.bookList = bookList;
    }

    public Book getBook() {
        return book;
    }

    public BookList getBookList() {
        return bookList;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setBookList(BookList bookList) {
        this.bookList = bookList;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((book == null) ? 0 : book.hashCode());
        result = prime * result + ((bookList == null) ? 0 : bookList.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BelongingPK other = (BelongingPK) obj;
        if (book == null) {
            if (other.book != null)
                return false;
        } else if (!book.equals(other.book))
            return false;
        if (bookList == null) {
            if (other.bookList != null)
                return false;
        } else if (!bookList.equals(other.bookList))
            return false;
        return true;
    }
    
    
}
