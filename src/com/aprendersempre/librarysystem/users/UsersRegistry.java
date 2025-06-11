package com.aprendersempre.librarysystem.users;

import java.util.ArrayList;

public class UsersRegistry {
    private ArrayList<User> usersList = new ArrayList<>();
    private int nextID;

    public void addNewUser (String userFullName, boolean isTeacher) {
        nextID = usersList.size() + 1;

        User newUser = isTeacher ? new Teacher(nextID, userFullName) : new Student(nextID, userFullName);

        usersList.add(newUser);
    }

    public User getUserByID(int userID) {
        return usersList.get(userID - 1); // Os IDs se iniciam em 1, os índices em 0.
    }

    public ArrayList<User> getUsersList() {
        return usersList;
    }

    public void showFormatedUsersList() {
        System.out.print("""
                ==============================
                USERS LIST
                ==============================
                """);

        for (User user : usersList) {
            System.out.println(user);
        }

        System.out.println("==============================");
    }
}