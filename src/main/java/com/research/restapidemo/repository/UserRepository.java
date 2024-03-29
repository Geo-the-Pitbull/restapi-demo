package com.research.restapidemo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.research.restapidemo.entities.Role;
import com.research.restapidemo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
    Optional<User> findByEmail(String email);

    User findByRole(Role role);
}
