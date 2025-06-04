package com.aprendersempre.librarysystem;

import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> booksList = new ArrayList<>();

    public void addNewBook (Book book) {
        booksList.add(book);
    }

    // Ao adicionar um livro ao acervo, ele é inicialmente definido como disponível.
    public void addNewBook (String title, String author) {
        Book newBook = new Book(title, author, true);

        booksList.add(newBook);
    }

    public void changeBookAvailability (String bookTitle, boolean isAvailable) {
        for (Book book : booksList) {
            if (book.getTitle().trim().equalsIgnoreCase(bookTitle.trim())) book.setAvailability(isAvailable);
        }
    }

    public ArrayList<Book> getBooksList() {
        return booksList;
    }
}
