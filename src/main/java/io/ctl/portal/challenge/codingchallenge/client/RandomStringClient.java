package io.ctl.portal.challenge.codingchallenge.client;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringClient {
    public String retrieveRandomString(int randomStringLength) {
        return RandomStringUtils.random(randomStringLength);
    }
}
