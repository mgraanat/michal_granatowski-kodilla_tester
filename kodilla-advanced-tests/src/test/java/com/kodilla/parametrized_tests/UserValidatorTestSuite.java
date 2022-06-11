package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    //@Test
    public void isUsernameOk(){
        assertTrue(validator.validateUsername("Michal8"));
    }
    //@Test
    public void isUsernameOk2(){
        assertTrue(validator.validateUsername("Mich  al8"));
    }
    //@Test
    public void isEmailOk(){
        assertTrue(validator.validateEmail("Michal8@onet.pl"));
    }
    //@Test
    public void isEmailOk2(){
        assertTrue(validator.validateEmail("Michal@8@onet.pl"));
    }
}
