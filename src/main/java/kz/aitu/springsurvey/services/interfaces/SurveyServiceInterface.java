package kz.aitu.springsurvey.services.interfaces;
import kz.aitu.springsurvey.models.Option;
import kz.aitu.springsurvey.models.Survey;

import java.util.List;

public interface SurveyServiceInterface {
    Survey createSurvey(Survey survey);
    Survey getById(int id);

    Survey participateSurvey (int surveyId, List<Option> selectedOptions);
}
