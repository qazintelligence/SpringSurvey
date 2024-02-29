package kz.aitu.springsurvey.services;

import kz.aitu.springsurvey.repositories.SurveyRepositoryInterface;
import kz.aitu.springsurvey.services.interfaces.SurveyServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class SurveyService implements SurveyServiceInterface {

    private final SurveyRepositoryInterface repo;

    public SurveyService(SurveyRepositoryInterface repo) {
        this.repo = repo;
    }
}
