package com.aprendersempre.librarysystem.users;

public class Student extends User{
    Student(String fullName) {
        super(fullName);
        setBookLoanLimit();
        setUserType();
    }

    @Override
    void setUserType() {
        this.userType = "Student";
    }

    @Override
    void setBookLoanLimit() {
        this.bookLoanLimit = 3;
    }
}
