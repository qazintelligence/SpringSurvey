package kz.aitu.springsurvey.services;

import kz.aitu.springsurvey.models.User;
import kz.aitu.springsurvey.repositories.UserRepositoryInterface;
import kz.aitu.springsurvey.services.interfaces.UserServiceInterface;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import java.util.List;
@Service

public class UserService implements UserServiceInterface {
    private final UserRepositoryInterface repo;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserService(UserRepositoryInterface repo) {
        this.repo = repo;
        passwordEncoder = new BCryptPasswordEncoder();
    }


    public User registerUser(User user) throws DataIntegrityViolationException{
        if (repo.findByEmail(user.getEmail()) != null) {
            throw new DataIntegrityViolationException("Email already exists");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return repo.save(user);
    }

    @Override
    public List<User> getAll() {
        return repo.findAll();
    }

    @Override
    public User getById(int id) {
        return repo.findById(id).orElse(null);
    }


    @Override
    public List<User> getBySurname(String surname) {
        return repo.findBySurname(surname);
    }
}
