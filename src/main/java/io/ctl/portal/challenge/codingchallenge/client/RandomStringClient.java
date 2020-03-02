package io.ctl.portal.challenge.codingchallenge.client;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

@Service
public class RandomStringClient {
    public String retrieveRandomString(int randomStringLength) {
        return RandomStringUtils.random(randomStringLength);
    }
}
