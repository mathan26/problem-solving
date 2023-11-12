package com.github.mathan26.concepts.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Book {
    private String name;
    private int releaseYear;
    private String isbn;

    public Book(String name, int releaseYear, String isbn) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.isbn = isbn;
    }

    public static Map<String, String> listToMap(List<Book> books) {
        return books.stream().collect(Collectors.toMap(Book::getIsbn, Book::getName));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
