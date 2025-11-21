package com.abc.ecom.service.impl;

import com.abc.ecom.model.User;
import com.abc.ecom.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public Optional<User> featchUser(Long id) {
        return userList.stream()
                       .filter(user -> user.getUserId().equals(id))
                       .findFirst();
    }


}
