package com.visitormaker.user.web;


import com.visitormaker.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public ArrayList getUsers(ModelMap model) {
        return userService.getUserList();
    }

}

