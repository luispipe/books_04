package com.example.book_04.Models;

public class Editorial {

    private final String ID;
    private String name;
    private String location;
    private String email;

    public Editorial(String ID, String name, String location, String email) {
        this.ID = ID;
        this.name = name;
        this.location = location;
        this.email = email;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
