package com.thinkitive.simpleSpringSecurity.repository;

import com.thinkitive.simpleSpringSecurity.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {
    Users findByUserName(String userName);
}
