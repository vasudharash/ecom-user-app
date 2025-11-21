package com.abc.ecom.service;

import com.abc.ecom.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> featchAllUser();
    List<User> addUser(User user);
    Optional<User> featchUser(Long Id);
}
