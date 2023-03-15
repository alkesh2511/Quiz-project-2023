package com.quizedrive.quizeexam.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quizedrive.quizeexam.Model.Exam.Category;
import com.quizedrive.quizeexam.Model.Exam.Quize;
import com.quizedrive.quizeexam.Service.QuizeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin("*")
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizeService quizService;

    //add quiz service
    @PostMapping("/")
    public ResponseEntity<Quize> add(@RequestBody Quize quiz) {
        return ResponseEntity.ok(this.quizService.addQuize(quiz));
    }

    //update quiz

    @PutMapping("/")
    public ResponseEntity<Quize> update(@RequestBody Quize quiz) {
        return ResponseEntity.ok(this.quizService.updateQuiz(quiz));
    }

    //get quiz
    @GetMapping("/")
    public ResponseEntity<?> quizzes() {
        return ResponseEntity.ok(this.quizService.getQuizzes());
    }

    //get single quiz
    @GetMapping("/{qid}")
    public Quize quiz(@PathVariable("qid") Long qid) {
        return this.quizService.getQuiz(qid);
    }

    //delete the quiz
    @DeleteMapping("/{qid}")
    public void delete(@PathVariable("qid") Long qid) {
        this.quizService.deleteQuiz(qid);
    }

    @GetMapping("/category/{cid}")
    public List<Quize> getQuizzesOfCategory(@PathVariable("cid") Long cid)
    {
        Category category = new Category();
        category.setCid(cid);
      return this.quizService.getQuizzesOfCategory(category);
    }






    
}
