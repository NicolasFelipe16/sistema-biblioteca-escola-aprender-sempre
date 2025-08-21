package com.aprendersempre.librarysystem.internal;

import java.time.LocalDate;

public class Loan {
    private Book book;
    private User user;
    private LocalDate time;

    Loan(Book book, User user) {
        this.book = book;
        this.user = user;
        this.time = LocalDate.now();
    }
}
