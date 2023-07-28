package com.example.shoplaptop.Service;

import com.example.shoplaptop.Model.UserModel;
import com.example.shoplaptop.Repository.UserRepository;
import com.mongodb.MongoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserService implements test{
    @Autowired
    private  UserRepository userRepository;
    @Override
    public UserModel save(UserModel userModel) {
        return userRepository.save(userModel);
    }
}
