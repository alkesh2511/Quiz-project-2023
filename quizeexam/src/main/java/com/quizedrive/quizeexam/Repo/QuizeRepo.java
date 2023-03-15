package com.quizedrive.quizeexam.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizedrive.quizeexam.Model.Exam.Category;
import com.quizedrive.quizeexam.Model.Exam.Quize;

public interface QuizeRepo  extends JpaRepository<Quize, Long>{

    List<Quize> findByCategory(Category category);

    List<Quize> findByActive(boolean b);

    List<Quize> findByCategoryAndActive(Category c, boolean b);
    
}
