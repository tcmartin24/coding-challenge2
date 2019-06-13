package io.ctl.portal.challenge.codingchallenge.service;

import io.ctl.portal.challenge.codingchallenge.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

    private List<Person> people = new ArrayList();

    public List<Person> getPeople() {
        return people;
    }

    public Person savePerson(Person person) {
        int nextId = 50;
        person.setId(nextId);
        people.add(person);
        return person;
    }
}
