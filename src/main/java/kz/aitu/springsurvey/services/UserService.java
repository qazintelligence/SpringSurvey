package kz.aitu.springsurvey.services;

import kz.aitu.springsurvey.models.User;
import kz.aitu.springsurvey.repositories.UserRepositoryInterface;
import kz.aitu.springsurvey.services.interfaces.UserServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UserService implements UserServiceInterface {

    private final UserRepositoryInterface repo;

    public UserService(UserRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public List<User> getBySurname(String surname) {
        return null;
    }
}
