package com.wms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wms.model.User;
import com.wms.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    // REGISTER API
    @PostMapping("/register")
    public User register(@RequestParam String name,
                         @RequestParam String email,
                         @RequestParam String password) {

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);

        return service.register(user);
    }

    // LOGIN API
    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password) {

        return service.login(email, password);
    }
}