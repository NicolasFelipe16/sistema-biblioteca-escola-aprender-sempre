package com.aprendersempre.librarysystem;

public class Book {
    private final String title;
    private final String author;
    private boolean isAvailable = false;

    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // Uma instância independente de um livro é definida por padrão como indisponível, pois não foi adicinada ao acervo.
    // Ao instanciar um livro com o metodo "addNewBook()" (classe "Library"), ele é inicialmente definido como disponível no acervo.
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAvailability() {
        if (this.isAvailable) {
            return "Available";
        } else if (!this.isAvailable){
            return "Unavailable";
        }
        return "";
    }

    // A disponibilidade é um dado booleano para evitar erros de digitação em "Available" ou "Unavailable".
    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return title + "(" + author + ")" + " - " + getAvailability();
    }
}