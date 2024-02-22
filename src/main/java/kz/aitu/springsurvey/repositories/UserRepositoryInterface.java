package kz.aitu.springsurvey.repositories;

import kz.aitu.springsurvey.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryInterface extends JpaRepository<User,Integer> {
}
