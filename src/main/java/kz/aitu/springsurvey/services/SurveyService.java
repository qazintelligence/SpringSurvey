package kz.aitu.springsurvey.services;

import kz.aitu.springsurvey.models.*;
import kz.aitu.springsurvey.repositories.SurveyRepositoryInterface;
import kz.aitu.springsurvey.services.interfaces.SurveyServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyService implements SurveyServiceInterface {

    private final SurveyRepositoryInterface repo;

    public SurveyService(SurveyRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public Survey createSurvey(Survey survey) {
        return repo.save(survey);
    }

    @Override
    public void addQuestion(int survey_id, Question question) {

    }


    @Override
    public Survey getById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Survey saveSurvey(Survey survey) {
        return repo.save(survey);
    }

    @Override
    public Survey participateSurvey(int surveyId, List<Option> selectedOptions) {
        Survey survey = repo.findById(surveyId).orElse(null);

        return repo.save(survey);
    }
}
