package com.aprendersempre.librarysystem.internal;


public class LoanManager {
    public static void createLoan(Book book, User user) {
        if (book.isAvailable()) {
            if (user.canBorrowBooks()) {
                user.borrowedBooksList.add(book);
                book.markAsUnavailable();
                System.out.println("Book '" + book.getTitle() + "' borrowed to " + user.getFullName());
            } else {
                System.out.println(user.getFullName() + " can not borrow more books.");
            }
        } else {
            System.out.println("Book '" + book.getTitle() + "' is not available to loans.");
        }
    }
}
