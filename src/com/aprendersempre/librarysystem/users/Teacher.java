package com.aprendersempre.librarysystem.users;

public class Teacher extends User{
    Teacher(String fullName) {
        super(fullName);
        bookLoanLimit = 5;
    }

    @Override
    UserType getType() {
        return UserType.TEACHER;
    }
}