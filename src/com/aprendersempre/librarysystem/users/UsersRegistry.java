package com.aprendersempre.librarysystem.users;

import java.util.ArrayList;

public class UsersRegistry {
    private ArrayList<User> usersList = new ArrayList<>();

    public void addNewUser (String fullName, UserType userType) {
        User newUser = UserFactory.createUser(fullName, userType);

        usersList.add(newUser);
    }

    public User getUserByID(int userId) {
        return usersList.stream()
                .filter(user -> user.getId() == userId)
                .findFirst()
                .orElse(null);
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