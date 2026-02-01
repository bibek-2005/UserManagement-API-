package com.example.usermanagement.service;
import com.example.usermanagement.entity.User;
import com.example.usermanagement.exception.UserNotFoundException;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.usermanagement.repository.UserRepository;

@Service
public class UserService {
    
    private final UserRepository repo;

    public UserService(UserRepository repo){
        this.repo = repo;
    }

    public User CreateUser(User user){
        return repo.save(user);
    }
    public User getUser(Long id){
        return repo.findById(id).orElseThrow(() -> new UserNotFoundException(id));


    }
    public List<User> getAllUser(){
        return repo.findAll();
    }
    public void deleteUser(Long id){
        repo.deleteById(id);
    }

    
}
