package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.IntSources#provideIntForTest")
    public void testBmi(double heightInMeters, int weightInKilogram){
        double bmi = weightInKilogram / (heightInMeters * heightInMeters);
        assertEquals(16.3,bmi,0.1);

    }


}