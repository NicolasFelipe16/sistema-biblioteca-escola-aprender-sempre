package com.aprendersempre.librarysystem.users;

public class UserFactory {
    public static User createUser(String fullName, UserType userType) {
        return switch (userType) {
            case TEACHER -> new Teacher(fullName);
            case STUDENT -> new Student(fullName);
        };
    }
}