package com.jonathas.booklist.projections;

public interface BookMinProjection {
    Long getId();
    String getTitle();
    Integer getYearOfPublication();
    String getImageUrl();
    String getShortDescription();
    Integer getPosition();
}
