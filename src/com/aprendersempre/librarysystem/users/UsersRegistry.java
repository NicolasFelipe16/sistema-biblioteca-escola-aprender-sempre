package com.aprendersempre.librarysystem.users;

import java.util.ArrayList;

public class UsersRegistry {
    private ArrayList<User> usersList = new ArrayList<>();

    public void addNewUser (String fullName, UserType userType) {
        User newUser = User.createUser(fullName, userType);

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