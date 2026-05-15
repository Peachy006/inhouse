package com.inhouse.bracket;

import com.inhouse.user.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bracket {
    Set<User> users;

    public Bracket() {
        this.users = new HashSet<>();
    }

    public Set<User> getUsers() {
        return users;
    }

    public void addUser(User u) {
        users.add(u);
    }

    public int userCount() {
        return users.size();
    }

}
