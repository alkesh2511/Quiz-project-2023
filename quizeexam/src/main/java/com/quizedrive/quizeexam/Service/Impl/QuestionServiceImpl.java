package com.quizedrive.quizeexam.Service.Impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizedrive.quizeexam.Model.Exam.Question;
import com.quizedrive.quizeexam.Model.Exam.Quize;
import com.quizedrive.quizeexam.Repo.QuetionRepo;
import com.quizedrive.quizeexam.Service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuetionRepo quetionRepo;

    @Override
    public Question addQuestion(Question question) {
       return this.quetionRepo.save(question);
    }

    @Override
    public Question updateQuestion(Question question) {
        return this.quetionRepo.save(question);

    }

    @Override
    public Set<Question> getQuestions() {
     return new HashSet<>(this.quetionRepo.findAll());
    }

    @Override
    public Question getQuestion(Long questionId) {
        return this.quetionRepo.findById(questionId).get();
    }

    @Override
    public Set<Question> getQuestionsOfQuiz(Quize quiz) {
        return this.quetionRepo.findByquize(quiz);
    }

    @Override
    public void deleteQuestion(Long quesId) {
        Question question = new Question();
        question.setQuesId(quesId);
        this.quetionRepo.delete(question);
    }

    @Override
    public Question get(Long questionsId) {
        return this.quetionRepo.getReferenceById(questionsId);
        }
    
}
