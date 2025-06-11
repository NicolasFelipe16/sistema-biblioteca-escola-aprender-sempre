package com.aprendersempre.librarysystem.users;

public class Student extends User{
    Student(int ID, String fullName) {
        super(ID, fullName, false, 3);
    }
}
