package kz.aitu.springsurvey.controllers;

import kz.aitu.springsurvey.models.User;
import kz.aitu.springsurvey.models.Survey;
import kz.aitu.springsurvey.models.Option;
import kz.aitu.springsurvey.models.Question;
import kz.aitu.springsurvey.models.Response;
import kz.aitu.springsurvey.services.interfaces.SurveyServiceInterface;
import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("surveys")
public class SurveyController {
    private final SurveyServiceInterface service;

    public SurveyController(SurveyServiceInterface service){
        this.service = service;
    }

    @PostMapping("/createSurvey")
    public ResponseEntity<Survey> createSurvey (@RequestBody Survey survey){
        Survey createdSurvey = service.createSurvey(survey);

        if(createdSurvey == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(createdSurvey, HttpStatus.CREATED);
    }




    @GetMapping("/{survey_id}")
    public ResponseEntity<Survey> getById(@PathVariable("survey_id") int id){
        Survey survey = service.getById(id);
        if(survey == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(survey, HttpStatus.OK);
    }

    @PostMapping("/{survey_id}")
    public ResponseEntity<Survey> participateSurvey(@PathVariable("survey_id") int id, @RequestBody List<Option> selectedOptions) {
        Survey participatedSurvey = service.participateSurvey(id, selectedOptions);
        if (participatedSurvey == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(participatedSurvey, HttpStatus.OK);
    }
}
