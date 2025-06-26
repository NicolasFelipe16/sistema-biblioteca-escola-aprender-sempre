package com.aprendersempre.librarysystem.users;

import com.aprendersempre.librarysystem.books.Book;
import java.util.ArrayList;

public abstract class User {
    private static int idCounter = 1;
    private int id;
    private String fullName;
    protected String userType;
    protected int bookLoanLimit;
    private ArrayList<Book> borrowedBooksList = new ArrayList<>();

    User(String fullName) {
        this.id = idCounter++;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    abstract UserType getType();

    public int bookLoanLimit() {
        return bookLoanLimit;
    };

    public boolean canLendBooks() {
        return bookLoanLimit > borrowedBooksList.size();
    }

    public ArrayList<Book> getBorrowedBooksList() {
        return borrowedBooksList;
    }

    public void showFormatedBorrowedBooksList() {
        System.out.print("""
                ==============================
                BORROWED BOOKS LIST
                ==============================
                """);

        for (Book book : borrowedBooksList) {
            System.out.println(book);
        }

        System.out.println("==============================");
    }

    @Override
    public String toString() {
        return "#" + this.id + " | " + this.fullName + " (" + this.getType() + ")";
    }
}