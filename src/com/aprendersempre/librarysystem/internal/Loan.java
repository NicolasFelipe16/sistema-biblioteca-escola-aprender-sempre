package com.aprendersempre.librarysystem.internal;

public class Loan {
    private Book book;
    private User user;

    Loan(Book book, User user) {
        this.book = book;
        this.user = user;
    }
}
