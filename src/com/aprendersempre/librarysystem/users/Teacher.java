package com.aprendersempre.librarysystem.users;

public class Teacher extends User{
    public Teacher(String fullName) {
        super(fullName);
        setBookLoanLimit();
        setUserType();
    }

    @Override
    void setUserType() {
        this.userType = "Teacher";
    }

    @Override
    void setBookLoanLimit() {
        this.bookLoanLimit = 5;
    }
}