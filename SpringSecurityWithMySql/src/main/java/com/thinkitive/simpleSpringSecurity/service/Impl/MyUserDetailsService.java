package com.thinkitive.simpleSpringSecurity.service.Impl;

import com.thinkitive.simpleSpringSecurity.config.MyUserDetails;
import com.thinkitive.simpleSpringSecurity.entity.Users;
import com.thinkitive.simpleSpringSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepository.findByUserName(username);

        return new MyUserDetails(user);
    }
}
