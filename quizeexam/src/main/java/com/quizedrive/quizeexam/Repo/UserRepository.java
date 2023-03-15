package com.quizedrive.quizeexam.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizedrive.quizeexam.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
        public User  findByUsername(String username);
    
}
