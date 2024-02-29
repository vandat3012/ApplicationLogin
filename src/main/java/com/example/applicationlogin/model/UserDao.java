package com.example.applicationlogin.model;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static final List<User> users = new ArrayList<>();
    static {
        users.add(new User("dat","12345","Dat","dat@gmail",18));
        users.add(new User("phap","12345","Phap","phap@gmail",18));
        users.add(new User("dung","12345","Dung","dung@gmail",18));
        users.add(new User("nhat","12345","Nhat","nhat@gmail",18));
    }

    public static User checkLogin (Login login) {
        for (User user: users) {
            if (user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
