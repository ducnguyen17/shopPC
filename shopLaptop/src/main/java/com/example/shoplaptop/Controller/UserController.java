package com.example.shoplaptop.Controller;

import com.example.shoplaptop.Model.UserModel;
import com.example.shoplaptop.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/users")
    public UserModel createUser(@RequestBody UserModel userModel) {
        return userService.save(userModel);
    }
}
