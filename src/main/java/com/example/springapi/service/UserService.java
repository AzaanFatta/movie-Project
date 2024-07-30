package com.example.springapi.service;

import com.example.springapi.api.controller.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

//     private List<User> userList;
//
//    public UserService() {
//        userList = new ArrayList<>();
//
//        User user = new User("a","1");
//        User user2 = new User("2", "2");
//
//        userList.addAll(Arrays.asList(user,user2));
//    }
//
//
//    public Optional<User> getUser(String name, String pass) {
//
//        Optional optional = Optional.empty();
//        for (User user: userList) {
//            if (name == user.getName() || pass == user.getPass()) {
//                optional = Optional.of(user);
//                return optional;
//            }
//        }
//        return optional;
//    }


    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User("a", "1");
        User user2 = new User("b", "2");

        userList.addAll(Arrays.asList(user1, user2));
    }

    public Optional<User> getUser(String name, String pass) {
        return userList.stream()
                .filter(user -> user.getName().equals(name) && user.getPass().equals(pass))
                .findFirst();
    }
}


