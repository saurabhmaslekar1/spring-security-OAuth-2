package com.thinkitive.simpleSpringSecurity.service.Impl;

import com.thinkitive.simpleSpringSecurity.entity.Users;
import com.thinkitive.simpleSpringSecurity.repository.UserRepository;
import com.thinkitive.simpleSpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<Users> getAllUsers() {
        List<Users> users= userRepository.findAll();
        return users;
    }
}
