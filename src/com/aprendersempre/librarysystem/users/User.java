package com.aprendersempre.librarysystem.users;

import com.aprendersempre.librarysystem.books.Book;

import java.util.ArrayList;

public class User {
    private int ID;
    private String fullName;
    private boolean isTeacher;
    private ArrayList<Book> borrowedBooksList = new ArrayList<>();
    private int bookLoanLimit;

    User(int ID, String fullName, boolean isTeacher, int bookLoanLimit) {
        this.ID = ID;
        this.fullName = fullName;
        this.isTeacher = isTeacher;
        this.bookLoanLimit = bookLoanLimit;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUserType() {
        return isTeacher? "Teacher" : "Student";
    }

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
        return "#" + this.ID + " | " + this.fullName + " (" + this.getUserType() + ")";
    }
}