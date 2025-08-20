package com.jonathas.booklist.DTO;

import com.jonathas.booklist.entities.Book;

public class BookMinDTO {
    private Long id;
    private String title;
    private Integer yearOfPublication;
    private String imageUrl;
    private String shortDescription;

    public BookMinDTO() {
    }

    public BookMinDTO(Book entity) {
        id = entity.getId();
        title = entity.getTitle();
        yearOfPublication = entity.getYearOfPublication();
        shortDescription = entity.getShortDescription();
        imageUrl = entity.getImageUrl();
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


    public String getShortDescription() {
        return shortDescription;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
