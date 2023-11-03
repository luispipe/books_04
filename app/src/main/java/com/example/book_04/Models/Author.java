package com.example.book_04.Models;

public class Author {

    private final String ID;
    private String name,nationality;

    public Author(String ID, String name, String nationality) {
        this.ID = ID;
        this.name = name;
        this.nationality = nationality;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


}
