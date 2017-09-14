package us.cyzic.codingchallenge914.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import us.cyzic.codingchallenge914.model.Person;
import us.cyzic.codingchallenge914.service.AppService;

@RestController
public class AppController {

    private final AppService service;

    @Autowired
    public AppController(AppService service) {
        this.service = service;
    }

    @GetMapping(value = "/me", produces = "application/json")
    public Person getMe() {
        return service.getMe();
    }
}
