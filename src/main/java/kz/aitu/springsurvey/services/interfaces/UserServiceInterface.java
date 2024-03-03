package kz.aitu.springsurvey.services.interfaces;

import kz.aitu.springsurvey.models.User;

import java.util.List;

public interface UserServiceInterface {
    User registerUser(User user);
    List<User> getAll();
    User getById(int id);
    List<User> getBySurname(String surname);

}
