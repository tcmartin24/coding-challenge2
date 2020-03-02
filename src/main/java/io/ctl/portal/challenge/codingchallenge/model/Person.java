package io.ctl.portal.challenge.codingchallenge.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String randomWord;

    public static List<Person> createPeople(String personCSVList) {
        return Arrays.asList(personCSVList.split("\\|"))
                .stream()
                .map(personString -> {
                    String[] personArray = personString.split(",");
                    Person tmpPerson = new Person();
                    tmpPerson.firstName = personArray[1].trim();
                    tmpPerson.lastName = personArray[0].trim();
                    tmpPerson.age = Integer.valueOf(personArray[2].trim());
                    return tmpPerson;
                }).collect(Collectors.toList());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRandomWord() {
        return randomWord;
    }

    public void setRandomWord(String randomWord) {
        this.randomWord = randomWord;
    }
}
