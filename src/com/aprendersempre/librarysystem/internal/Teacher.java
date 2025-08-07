package com.aprendersempre.librarysystem.internal;

public class Teacher extends User{
    public Teacher(String fullName) {
        super(fullName);
        bookLoanLimit = 5;
    }

    @Override
    public UserType getType() {
        return UserType.TEACHER;
    }
}