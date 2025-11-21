package com.abc.ecom.controller;

import com.abc.ecom.model.User;
import com.abc.ecom.service.impl.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {


    /* To get access the bean we can use @Autowired or we can create constructor or
    we can use @AllArgsConstructor from lombok */
    UserServiceImpl userServiceImpl;

    @GetMapping("/api/user")
    public ResponseEntity<List<User>> getListOfUsers() {
        return ResponseEntity.ok(userServiceImpl.featchAllUser());
        // other way to use response entity
        //return new ResponseEntity<>(userServiceImpl.featchAllUser(), HttpStatus.OK);

    }

    @GetMapping("/api/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        User user = userServiceImpl.featchUser(id);
        if(user == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userServiceImpl.featchUser(id));
    }

    @PostMapping("/api/user")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        userServiceImpl.addUser(user);
        return ResponseEntity.ok("User added successfully");
    }
}
