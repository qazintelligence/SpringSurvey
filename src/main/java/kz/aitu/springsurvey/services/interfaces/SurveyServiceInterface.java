package kz.aitu.springsurvey.services.interfaces;
import kz.aitu.springsurvey.models.Survey;

public interface SurveyServiceInterface {
    Survey createSurvey(Survey survey);
    Survey getById(int id);
}
