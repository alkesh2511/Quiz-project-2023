package com.quizedrive.quizeexam.Service;

import java.util.Set;

import com.quizedrive.quizeexam.Model.Exam.Question;
import com.quizedrive.quizeexam.Model.Exam.Quize;

public interface QuestionService {

    public Question addQuestion(Question question);

    public Question updateQuestion(Question question);

    public Set<Question> getQuestions();

    public Question getQuestion(Long questionId);

    public Set<Question> getQuestionsOfQuiz(Quize quiz);

    public void deleteQuestion(Long quesId);

    public Question get(Long questionsId);

    
}
