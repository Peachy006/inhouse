package com.inhouse.brackets;

import com.inhouse.bracket.Bracket;
import com.inhouse.user.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class BracketGenerator{

    public List<Bracket> generateBrackets(List<User> users) {
        int userCount = users.size();

        List<Integer> brackets = new ArrayList<>();

        int remainingUsers = userCount;

        while(remainingUsers < 0) {
            if(remainingUsers >= 3 && remainingUsers <= 5) {
                brackets.add(remainingUsers);
                remainingUsers = 0;
            }
            else if
        }


    }


    public List<User> sortUsers(Set<User> users) {
        int n = users.size();
        User[] sortedUsers = new User[n];
        int count = 0;
        for(User u : users) {
            sortedUsers[count++] = u;
        }
        Arrays.sort(sortedUsers);
        return new ArrayList<>(Arrays.asList(sortedUsers));
    }

    public List<Integer> BracketSizes(int count) {
        List<Integer> sizes = 
    }

}