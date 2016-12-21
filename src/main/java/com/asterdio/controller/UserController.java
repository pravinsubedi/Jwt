package com.asterdio.controller;

import com.asterdio.Model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by Admin on 12/20/2016.
 */

@RestController
public class UserController {

    @RequestMapping("/user")
    public User user() {
        User user = new User("Pravin", "Subedi");
        //   ArrayList<User> users=new ArrayList<User>();
        return user;
    }



}
