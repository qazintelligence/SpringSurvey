package kz.aitu.springsurvey.services;

import kz.aitu.springsurvey.models.Survey;
import kz.aitu.springsurvey.models.User;
import kz.aitu.springsurvey.repositories.SurveyRepositoryInterface;
import kz.aitu.springsurvey.services.interfaces.SurveyServiceInterface;
import org.springframework.stereotype.Service;

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
    public Survey getById(int id) {
        return repo.findById(id).orElse(null);
    }
}
