package kz.aitu.springsurvey.services;
import kz.aitu.springsurvey.repositories.ResponseRepositoryInterface;
import kz.aitu.springsurvey.services.interfaces.ResponseServiceInterface;
import org.springframework.stereotype.Service;
@Service
public class ResponseService implements ResponseServiceInterface{
    private final ResponseRepositoryInterface repo;

    public ResponseService(ResponseRepositoryInterface repo) {
        this.repo = repo;
    }

}
