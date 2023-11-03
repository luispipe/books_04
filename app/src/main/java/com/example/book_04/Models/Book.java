package com.example.book_04.Models;

public class Book {

    private final String ISBN;
    private String title,editorial,author;
    private int year;

    public Book(String ISBN, String title, String editorial, String author, int year) {
        this.ISBN = ISBN;
        this.title = title;
        this.editorial = editorial;
        this.author = author;
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
