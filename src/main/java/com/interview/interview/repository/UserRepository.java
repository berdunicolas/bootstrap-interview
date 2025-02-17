package com.interview.interview.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.interview.interview.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByUsername(String username);
}
