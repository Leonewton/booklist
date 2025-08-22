package com.jonathas.booklist.DTO;

import com.jonathas.booklist.entities.Book;

public class BookDTO {

    private Long id;
    private String title;
    private Integer yearOfPublication;
    private String author;
    private String imageUrl;
    private String genre;
    private String shortDescription;
    private String longDescription;

    public BookDTO(){

    }

    public BookDTO(Book entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.yearOfPublication = entity.getYearOfPublication();
        this.author = entity.getAuthor();
        this.imageUrl = entity.getImageUrl();
        this.genre = entity.getGenre();
        this.shortDescription = entity.getShortDescription();
        this.longDescription = entity.getLongDescription();
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

    public String getImageUrl() {
        return imageUrl;
    }

    public String getGenre() {
        return genre;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
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

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    
}

