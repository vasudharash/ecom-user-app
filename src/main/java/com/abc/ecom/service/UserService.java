package com.abc.ecom.service;

import com.abc.ecom.model.User;

import java.util.List;

public interface UserService {

    List<User> featchAllUser();
    List<User> addUser(User user);
    User featchUser(Long Id);
}
