package com.aprendersempre.librarysystem.internal;


public class LoanService {
    public Loan createLoan(Book book, User user) {
        if (!book.isAvailable()) {
            throw new IllegalStateException("Book is not available.");
        }
        if (!user.canBorrowBooks()) {
            throw new IllegalStateException("User can not borrow books.");
        }

        book.markAsUnavailable();
        user.addBorrowedBook(book);

        return new Loan(book, user);
    }
}
