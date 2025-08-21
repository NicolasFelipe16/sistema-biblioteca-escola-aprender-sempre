package com.aprendersempre.librarysystem.internal;

public class Student extends User{
    public Student(String fullName) {
        super(fullName);
        bookLoanLimit = 3;
    }

    @Override
    public UserType getType() {
        return UserType.STUDENT;
    }
}