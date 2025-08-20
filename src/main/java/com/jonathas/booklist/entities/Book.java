package com.jonathas.booklist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer yearOfPublication;
    private String author;
    private String imageUrl;
    private String genre;
            
    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;


    public Book() {
    }

    public Book(Long id, String title, Integer yearOfPublication, String author, String shortDescription, String longDescription, String imageUrl, String genre) {
        this.id = id;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.imageUrl = imageUrl;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getGenre() {
        return genre;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Book other = (Book) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
