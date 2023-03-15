package com.quizedrive.quizeexam.Service;

import java.util.List;
import java.util.Set;

import com.quizedrive.quizeexam.Model.Exam.Category;
import com.quizedrive.quizeexam.Model.Exam.Quize;

public interface QuizeService {

    public Quize addQuize(Quize quize);

    public Quize updateQuiz(Quize quize);

    public Set<Quize> getQuizzes();

    public Quize getQuiz(Long quizId);

    public void deleteQuiz(Long quizId);


    public List<Quize> getQuizzesOfCategory(Category category);

    public List<Quize> getActiveQuizzes();

    public List<Quize> getActiveQuizzesOfCategory(Category c);

}
    

