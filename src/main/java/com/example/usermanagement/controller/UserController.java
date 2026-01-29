package com.example.usermanagement.controller;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usermanagement.entity.User;
import com.example.usermanagement.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;

    public UserController(UserService service){
        this.service = service;
    }
    @PostMapping
    public User create(@RequestBody User user){
        return service.createUser(user);

    }
    @GetMapping("/{id}")
    public User get(@PathVariable Long id){
        return service.getUser(id);
    }
    @GetMapping
    public List<User> getAll(){
        return service.getAllUser();
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
             service.deleteUser(id);
    }
    

    
}
