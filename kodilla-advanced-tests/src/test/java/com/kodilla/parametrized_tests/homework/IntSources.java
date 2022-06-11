package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class IntSources {

    static Stream<Arguments> provideIntForTest(){
        return Stream.of(
                Arguments.of(1.75,50),
                Arguments.of(1.80,80),
                Arguments.of(1.22,100)
        );
    }
}
