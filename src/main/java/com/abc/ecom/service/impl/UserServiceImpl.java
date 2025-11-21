package com.abc.ecom.service.impl;

import com.abc.ecom.model.User;
import com.abc.ecom.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private List<User> userList = new ArrayList<>();
    private Long id = 1L;

    @Override
    public List<User> featchAllUser() {
        return userList;
    }

    @Override
    public  List<User> addUser(User user) {
        user.setUserId(id++);
        userList.add(user);
        return userList;
    }

    @Override
    public User featchUser(Long id) {
        for (User user : userList) {
            if(user.getUserId().equals(id)){
                return user;
            }
        }
        return null;
    }


}
