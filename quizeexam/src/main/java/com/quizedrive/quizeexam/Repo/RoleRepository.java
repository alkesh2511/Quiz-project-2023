package com.quizedrive.quizeexam.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizedrive.quizeexam.Model.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
    
}
