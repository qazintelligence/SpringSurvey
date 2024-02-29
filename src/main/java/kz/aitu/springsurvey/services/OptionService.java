package kz.aitu.springsurvey.services;
import kz.aitu.springsurvey.repositories.OptionRepositoryInterface;
import kz.aitu.springsurvey.services.interfaces.OptionServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class OptionService implements OptionServiceInterface{
    private final OptionRepositoryInterface repo;

    public OptionService(OptionRepositoryInterface repo) {
        this.repo = repo;
    }


}
