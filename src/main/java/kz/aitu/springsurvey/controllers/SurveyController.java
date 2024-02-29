package kz.aitu.springsurvey.controllers;

import kz.aitu.springsurvey.services.interfaces.SurveyServiceInterface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("surveys")
public class SurveyController {
    private final SurveyServiceInterface service;

    public SurveyController(SurveyServiceInterface service){
        this.service = service;
    }
}
