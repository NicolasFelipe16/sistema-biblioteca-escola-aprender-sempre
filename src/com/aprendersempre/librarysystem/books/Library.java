package com.aprendersempre.librarysystem.books;

import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> booksList = new ArrayList<>();

    public void addNewBook (Book book) {
        book.markAsAvailable();
        booksList.add(book);
    }

    // Ao adicionar um livro ao acervo, ele é inicialmente definido como disponível.
    public void addNewBook (String title, String author) {
        Book newBook = new Book(title, author);

        newBook.markAsAvailable();
        booksList.add(newBook);
    }

    public ArrayList<Book> getBooksList() {
        return booksList;
    }

    public void showFormatedBooksList() {
        System.out.print("""
                ==============================
                BOOKS LIST
                ==============================
                """);

        for (Book book : booksList) {
            System.out.println(book);
        }

        System.out.println("==============================");
    }
}