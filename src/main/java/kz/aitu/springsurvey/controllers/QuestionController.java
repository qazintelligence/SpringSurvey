package kz.aitu.springsurvey.controllers;

import kz.aitu.springsurvey.services.interfaces.QuestionServiceInterface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("questions")
public class QuestionController {
    private final QuestionServiceInterface service;

    public QuestionController(QuestionServiceInterface service){
        this.service = service;
    }
}
