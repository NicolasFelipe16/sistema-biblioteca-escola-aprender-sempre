package com.aprendersempre.librarysystem.internal;

import java.util.ArrayList;

public class LoanService {
    ArrayList<Loan> loansList = new ArrayList<>();

    public void createLoan(Book book, User user) {
        if (!book.isAvailable()) {
            throw new IllegalStateException("Book is not available.");
        }
        if (!user.canBorrowBooks()) {
            throw new IllegalStateException("User can not borrow books.");
        }

        book.markAsUnavailable();
        user.addBorrowedBook(book);

        Loan loan = new Loan(book, user);
        loansList.add(loan);
    }

    public void finishLoan(Book book, User user) {
        this.loansList.removeIf(loan -> loan.getBook() == book && loan.getUser() == user);

        book.markAsAvailable();
        user.removeBorrowedBook(book);
    }

    public ArrayList<Loan> getLoansList() {
        return loansList;
    }

    public void showFormatedLoansList() {
        System.out.printf("""
                ==============================
                LOANS LIST (%d)
                ==============================
                """, loansList.size());

        for (Loan loan : loansList) {
            String bookTitle = loan.getBook().getTitle();
            String userFullName = loan.getUser().getFullName();

            System.out.println(bookTitle + " | " + userFullName);
        }

        System.out.println("==============================");
    }
}
