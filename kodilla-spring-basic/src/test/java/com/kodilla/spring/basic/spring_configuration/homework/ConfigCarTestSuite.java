package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

@SpringBootTest
public class ConfigCarTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/ConfigCarTestData.csv", numLinesToSkip = 1)
    public void shouldGetCar(String season, String hour, String carType, boolean lights) {
        //given
        LocalTime time = LocalTime.parse(hour);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("car", season, time);
        //when
        String type = car.getCarType();
        boolean lightsOn = car.hasHeadlightsTurnedOn();
        //then
        Assertions.assertEquals(carType, type);
        Assertions.assertEquals(lights, lightsOn);
    }
}
