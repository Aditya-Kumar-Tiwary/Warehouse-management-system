package com.wms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wms.model.User;
import com.wms.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    // REGISTER USER
    public User register(User user) {
        return repo.save(user);
    }

    // LOGIN USER
    public String login(String email, String password) {

        User user = repo.findByEmail(email);

        if (user != null && user.getPassword().equals(password)) {
            return "Login Success";
        } else {
            return "Login Failed";
        }
    }
}