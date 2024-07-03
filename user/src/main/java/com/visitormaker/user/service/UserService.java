package com.visitormaker.user.service;

import com.visitormaker.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public ArrayList getUserList() {
        return userRepository.getUserValues();
    }
}
