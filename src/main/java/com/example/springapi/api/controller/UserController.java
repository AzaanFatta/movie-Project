package com.example.springapi.api.controller;


import com.example.springapi.api.controller.model.User;
import com.example.springapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin("http://localhost:4200")
@RestController
public class UserController {


    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/user")
    public String getUser(@RequestBody User user) {
        System.out.println("start");
        Optional<User> foundUser = userService.getUser(user.getName(), user.getPass());
        if(foundUser.isPresent()) {
            System.out.println("end");
            return "success";
        }
        return "failure";
    }
}
