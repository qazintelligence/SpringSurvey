package kz.aitu.springsurvey.repositories;

import kz.aitu.springsurvey.models.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepositoryInterface extends JpaRepository<Survey, Integer> {
}
