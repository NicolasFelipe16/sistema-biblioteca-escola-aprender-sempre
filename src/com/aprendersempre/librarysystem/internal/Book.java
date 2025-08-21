package com.aprendersempre.librarysystem.internal;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        markAsAvailable();
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    void markAsAvailable() {
        this.isAvailable = true;
    }

    void markAsUnavailable() {
        this.isAvailable = false;
    }

    @Override
    public String toString() {
        return title + "(" + author + ")" + " - " + (this.isAvailable ? "Available" : "Unavailable");
    }
}