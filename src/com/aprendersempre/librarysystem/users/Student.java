package com.aprendersempre.librarysystem.users;

public class Student extends User{
    Student(String fullName) {
        super(fullName);
        bookLoanLimit = 3;
    }

    @Override
    UserType getType() {
        return UserType.STUDENT;
    }
}
