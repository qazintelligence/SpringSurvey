package kz.aitu.springsurvey.services;

import kz.aitu.springsurvey.models.Survey;
import kz.aitu.springsurvey.models.Option;
import kz.aitu.springsurvey.models.Response;
import kz.aitu.springsurvey.models.User;
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
    public Survey getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Survey participateSurvey(int surveyId, List<Option> selectedOptions) {
        Survey survey = repo.findById(surveyId).orElse(null);

        for (Option selectedOption : selectedOptions) {
            boolean found = false;
            for (Option option : survey.getOptions()) {
                if (option.getOption_id() == selectedOption.getOption_id()) {
                    option.setCount(option.getCount() + 1);
                    found = true;
                    break;
                }
            }
            if (!found) {
                throw new RuntimeException("Option with ID " + selectedOption.getId() + " not found in survey");
            }
        }
        survey.setCompleted(true);
        return repo.save(survey);
    }
}
