package com.example.shoplaptop.Service;

import com.example.shoplaptop.Model.StatusModel;
import com.example.shoplaptop.Model.UserModel;

import java.util.List;

public interface test {
    UserModel save(UserModel userModel);
    StatusModel<List<UserModel>> getAllUser();
}
