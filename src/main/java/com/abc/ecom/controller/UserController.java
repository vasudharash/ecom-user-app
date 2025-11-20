package com.abc.ecom.controller;

import com.abc.ecom.model.User;
import com.abc.ecom.service.impl.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {


    /* To get access the bean we can use @Autowired or we can create constructor or
    we can use @AllArgsConstructor from lombok */
    UserServiceImpl userServiceImpl;

    @GetMapping("/api/user")
    public List<User> getUser() {
        return userServiceImpl.featchAllUser();
    }

    @PostMapping("/api/user")
    public String createUser(@RequestBody User user) {
        userServiceImpl.addUser(user);
        return "User added successfully";
    }
}
