package kz.aitu.springsurvey.services;

import kz.aitu.springsurvey.repositories.QuestionRepositoryInterface;
import kz.aitu.springsurvey.services.interfaces.QuestionServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class QuestionService implements QuestionServiceInterface {
    private final QuestionRepositoryInterface repo;

    public QuestionService(QuestionRepositoryInterface repo) {
        this.repo = repo;
    }
}
