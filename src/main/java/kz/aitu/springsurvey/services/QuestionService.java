package kz.aitu.springsurvey.services;

import kz.aitu.springsurvey.models.Question;
import kz.aitu.springsurvey.repositories.QuestionRepositoryInterface;
import kz.aitu.springsurvey.services.interfaces.QuestionServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class QuestionService implements QuestionServiceInterface {
    private final QuestionRepositoryInterface repo;
    public QuestionService(QuestionRepositoryInterface repo) {
        this.repo = repo;
    }
    public Question getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Question getBySurveyId(int survey_id) {
        return repo.findQuestionBySurvey_id(survey_id);
    }

    @Override
    public Question addQuestion(Question question) {
        return repo.save(question);
    }

}
