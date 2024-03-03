package kz.aitu.springsurvey.controllers;

import kz.aitu.springsurvey.models.Survey;
import kz.aitu.springsurvey.models.Question;
import kz.aitu.springsurvey.services.interfaces.QuestionServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("questions")
public class QuestionController {
    private final QuestionServiceInterface service;

    public QuestionController(QuestionServiceInterface service){
        this.service = service;
    }

    @PostMapping("/addQuestion")
    public ResponseEntity<Question> addQuestion (@RequestBody Question question){
        Question addedQuestion = service.addQuestion(question);

        if(addedQuestion == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(addedQuestion, HttpStatus.CREATED);
    }

}
