package com.quest;

import java.util.ArrayList;
import java.util.List;

public class User {

    private static final List<User> userList = new ArrayList<>();
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUsersCount() {
        return userList.size();
    }
    public void addUser() {
        userList.add(this);
    }
}
