package io.ctl.portal.challenge.codingchallenge.controller;

import io.ctl.portal.challenge.codingchallenge.model.Person;
import io.ctl.portal.challenge.codingchallenge.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/people")
    public List<Person> getPeople() {
        return personService.getPeople();
    }

    @PostMapping("/people")
    public Person savePerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }
}
