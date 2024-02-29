package kz.aitu.springsurvey.controllers;

import kz.aitu.springsurvey.services.interfaces.OptionServiceInterface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("options")
public class OptionController {
    private final OptionServiceInterface service;

    public OptionController(OptionServiceInterface service) {
        this.service = service;
    }
}
