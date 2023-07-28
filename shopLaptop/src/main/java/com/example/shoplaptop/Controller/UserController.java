package com.example.shoplaptop.Controller;

import com.example.shoplaptop.Model.StatusModel;
import com.example.shoplaptop.Model.UserModel;
import com.example.shoplaptop.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/users")
    public UserModel createUser(@RequestBody UserModel userModel) {
        return userService.save(userModel);
    }
    @GetMapping("/getAlluser")
    public StatusModel<List<UserModel>> fillAll(){
        return userService.getAllUser();
    }
}
