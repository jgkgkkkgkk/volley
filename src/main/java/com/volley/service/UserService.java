package com.volley.service;

import com.volley.entities.User;
import com.volley.exceptions.EmailAlreadyExist;
import com.volley.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepo userRepo;

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public void createNewUser(User user) {
        Optional<User> dbUser = userRepo.findByEmail(user.getEmail());
        if (dbUser.isPresent()) {
            throw new EmailAlreadyExist("Email already exist! Please use another email!");
        }
        userRepo.save(user);
    }
}
