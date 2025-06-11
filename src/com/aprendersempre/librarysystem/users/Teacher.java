package com.aprendersempre.librarysystem.users;

public class Teacher extends User{
    Teacher(int ID, String fullName) {
        super(ID, fullName, true, 5);
    }
}