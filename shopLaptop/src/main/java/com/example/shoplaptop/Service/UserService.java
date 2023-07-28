package com.example.shoplaptop.Service;

import com.example.shoplaptop.Model.StatusModel;
import com.example.shoplaptop.Model.UserModel;
import com.example.shoplaptop.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements test{
    @Autowired
    private  UserRepository userRepository;
    @Override
    public UserModel save(UserModel userModel) {
        return userRepository.save(userModel);
    }

    @Override
    public StatusModel<List<UserModel>> getAllUser() {
        List<UserModel> userModels = userRepository.findAll();
        return new  StatusModel<>("success",HttpStatus.OK , userModels);
    }


}
