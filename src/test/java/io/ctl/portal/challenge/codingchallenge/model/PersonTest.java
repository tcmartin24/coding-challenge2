package io.ctl.portal.challenge.codingchallenge.model;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {

    @Test
    public void canGenerateOnePerson() {
        String onePersonCSVString = "Smith, Bob, 42";
        List<Person> people = Person.createPeople(onePersonCSVString);
        assertThat(people.size()).as("There should be 1 person").isEqualTo(1);
    }

    @Test
    public void canGenerateTwoPeople() {
        String twoPersonCSVString = "Jackson, Jerry, 12 | Smith, Bob, 42";
        List<Person> people = Person.createPeople(twoPersonCSVString);
        assertThat(people.size()).as("There should be 2 people").isEqualTo(2);
        assertThat(people.get(1).getFirstName()).as("Second person's first name should be 'Bob'").isEqualTo("Bob");
    }

}