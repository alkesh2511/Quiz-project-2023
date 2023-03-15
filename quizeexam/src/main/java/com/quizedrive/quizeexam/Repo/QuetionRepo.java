package com.quizedrive.quizeexam.Repo;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizedrive.quizeexam.Model.Exam.Question;
import com.quizedrive.quizeexam.Model.Exam.Quize;

public interface QuetionRepo extends JpaRepository<Question,Long>{

    Set<Question> findByquize(Quize quiz);
    
}
