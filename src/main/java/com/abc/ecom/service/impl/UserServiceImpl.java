package com.abc.ecom.service.impl;

import com.abc.ecom.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl {

    private List<User> userList = new ArrayList<>();
    private Long id = 1L;

    public List<User> featchAllUser() {
        return userList;
    }

    public  List<User> addUser(User user) {
        user.setUserId(id++);
        userList.add(user);
        return userList;
    }
}
