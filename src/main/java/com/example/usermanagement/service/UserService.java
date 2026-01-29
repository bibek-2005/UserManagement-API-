package com.example.usermanagement.service;
import org.springframework.stereotype.Service;
import com.example.usermanagement.repository.UserRepository;
import java.util.List;
import com.example.usermanagement.entity.User;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }
    public User createUser(User user){
        return repo.save(user);

    }
    public User getUser(Long id){
        return repo.findById(id).orElseThrow();
    }
    public List<User> getAllUser(){
        return repo.findAll();
    }
    public void deleteUser(Long id){
        repo.deleteById(id);
    }
    
}
