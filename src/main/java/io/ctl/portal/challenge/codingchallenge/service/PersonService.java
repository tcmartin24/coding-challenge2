package io.ctl.portal.challenge.codingchallenge.service;

import io.ctl.portal.challenge.codingchallenge.client.RandomStringClient;
import io.ctl.portal.challenge.codingchallenge.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private RandomStringClient randomStringClient;

    private List<Person> people = new ArrayList();

    public List<Person> getPeople() {
        return people;
    }

    public Person savePerson(Person person) {
        person.setId(99);
        person.setRandomWord(randomStringClient.retrieveRandomString(5));
        people.add(person);
        return person;
    }
}
