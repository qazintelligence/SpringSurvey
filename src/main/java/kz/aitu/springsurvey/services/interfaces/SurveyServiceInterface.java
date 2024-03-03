package kz.aitu.springsurvey.services.interfaces;
import kz.aitu.springsurvey.models.Option;
import kz.aitu.springsurvey.models.Survey;
import kz.aitu.springsurvey.models.Question;

import java.util.List;

public interface SurveyServiceInterface {
    Survey createSurvey(Survey survey);
    void addQuestion(int survey_id, Question question);
    Survey getById(int id);

    Survey participateSurvey (int surveyId, List<Option> selectedOptions);

    Survey saveSurvey(Survey survey);
}
