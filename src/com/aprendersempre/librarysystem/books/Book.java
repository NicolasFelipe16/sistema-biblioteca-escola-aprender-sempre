package com.aprendersempre.librarysystem.books;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    // Uma instância independente de um livro é definida por padrão como indisponível, pois não foi adicinada ao acervo.
    // Ao instanciar um livro com o metodo "addNewBook()" (classe "Library"), ele é inicialmente definido como disponível no acervo.
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAvailability() {
        return isAvailable? "Available" : "Unavailable";
    }

    public void markAsAvailable() {
        this.isAvailable = true;
    }

    public void markAsUnavailable() {
        this.isAvailable = false;
    }

    @Override
    public String toString() {
        return title + "(" + author + ")" + " - " + getAvailability();
    }
}