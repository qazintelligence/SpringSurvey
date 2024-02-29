package kz.aitu.springsurvey.repositories;

import kz.aitu.springsurvey.models.Question;
import kz.aitu.springsurvey.models.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepositoryInterface  extends JpaRepository<Survey, Integer> {


}
