package com.aprendersempre.librarysystem.users;

import com.aprendersempre.librarysystem.books.Book;
import java.util.ArrayList;

public abstract class User {
    private static int IdCounter = 1;
    private int Id;
    private String fullName;
    protected String userType;
    protected int bookLoanLimit;
    private ArrayList<Book> borrowedBooksList = new ArrayList<>();

    User(String fullName) {
        this.Id = IdCounter++;
        this.fullName = fullName;
    }

    public static User createUser(String fullName, UserType userType) {
        switch (userType) {
            case TEACHER:
                return new Teacher(fullName);
            case STUDENT:
                return new Student(fullName);
        }
        return null;
    }

    public String getFullName() {
        return fullName;
    }

    abstract void setUserType();

    public String getUserType() {
        return userType;
    }

    abstract void setBookLoanLimit();

    public int getBookLoanLimit() {
        return bookLoanLimit;
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
        return "#" + this.Id + " | " + this.fullName + " (" + this.getUserType() + ")";
    }
}