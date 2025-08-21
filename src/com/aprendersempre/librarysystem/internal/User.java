package com.aprendersempre.librarysystem.internal;

import java.util.ArrayList;

public abstract class User {
    private static int idCounter = 1;
    private int id;
    private String fullName;
    protected String userType;
    protected int bookLoanLimit;
    ArrayList<Book> borrowedBooksList = new ArrayList<>();

    User(String fullName) {
        this.id = idCounter++;
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    abstract UserType getType();

    public int bookLoanLimit() {
        return bookLoanLimit;
    }

    public boolean canBorrowBooks() {
        return bookLoanLimit > borrowedBooksList.size();
    }

    public ArrayList<Book> getBorrowedBooksList() {
        return borrowedBooksList;
    }

    public void addBorrowedBook(Book book) {
        this.borrowedBooksList.add(book);
    }

    public void showFormatedBorrowedBooksList() {
        System.out.printf("""
                ==============================
                BORROWED BOOKS LIST (%d)
                ==============================
                """, borrowedBooksList.size());

        for (Book book : borrowedBooksList) {
            System.out.println(book.getTitle());
        }

        System.out.println("==============================");
    }

    @Override
    public String toString() {
        return "#" + this.id + " | " + this.fullName + " (" + this.getType() + ")";
    }
}