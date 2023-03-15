package com.quizedrive.quizeexam.Service.Impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizedrive.quizeexam.Model.Exam.Category;
import com.quizedrive.quizeexam.Model.Exam.Quize;
import com.quizedrive.quizeexam.Repo.QuizeRepo;
import com.quizedrive.quizeexam.Service.QuizeService;

@Service
public class QuizeServiceImpl implements QuizeService{

    @Autowired
    private QuizeRepo quizeRepo;

    @Override
    public Quize addQuize(Quize quize) {
        return this.quizeRepo.save(quize);
    }

    @Override
    public Quize updateQuiz(Quize quize) {
       return this.quizeRepo.save(quize);
    }

    @Override
    public Set<Quize> getQuizzes() {
       return new HashSet<>(this.quizeRepo.findAll());
    }

    @Override
    public Quize getQuiz(Long quizId) {
       return this.quizeRepo.findById(quizId).get();
    }

    @Override
    public void deleteQuiz(Long quizId) {
    
        this.quizeRepo.deleteById(quizId);    
    }

    @Override
    public List<Quize> getQuizzesOfCategory(Category category) {
        return this.quizeRepo.findByCategory(category);
    }

    @Override
    public List<Quize> getActiveQuizzes() {
        return this.quizeRepo.findByActive(true);
    }

    @Override
    public List<Quize> getActiveQuizzesOfCategory(Category c) {
        return this.quizeRepo.findByCategoryAndActive(c, true);
      
    }

}