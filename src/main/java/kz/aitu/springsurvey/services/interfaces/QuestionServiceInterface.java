package kz.aitu.springsurvey.services.interfaces;
import kz.aitu.springsurvey.models.Question;

public interface QuestionServiceInterface {
    Question getById(int id);
    Question getBySurveyId(int survey_id);
    Question addQuestion(Question question);
}
