package com.quizedrive.quizeexam.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizedrive.quizeexam.Model.Exam.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {
    
}
