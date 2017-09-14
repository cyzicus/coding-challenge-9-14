package us.cyzic.codingchallenge914.service;

import org.springframework.stereotype.Service;
import us.cyzic.codingchallenge914.model.Person;

@Service
public class AppService {

    public Person getMe() {
        return Person.builder().firstName("Jason").lastName("Miller").build();
    }
}
