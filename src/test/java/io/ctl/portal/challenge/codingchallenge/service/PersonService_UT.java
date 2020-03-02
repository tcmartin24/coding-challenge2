package io.ctl.portal.challenge.codingchallenge.service;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class PersonService_UT {
    private PersonService service = new PersonService();

    @Test
    public void savedPersonIDIs100AfterSavingFirstPerson() {
//        assertThat(savedPerson.getId()).isEqualTo(100);
    }

    @Test
    public void afterSaving4People_4thPersonIDIs400() {
//        assertThat(savedPerson.getId()).isEqualTo(400);
    }

    @Test
    public void savedPersonRandomWordFieldLengthEqualsFirstnamePlusLastnameLength() {
        // Given that saved person's first name is: "Jake"
        // And saved Person's last name is: "Smith"
        // assertThat(savedPerson.getRandomWord().length()).isEqualTo(9)
    }
}
