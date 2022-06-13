package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class ConfigCar {

    @Bean
    public Car getCar(String season, LocalTime hour) {
        boolean isTurned = hour.isAfter(LocalTime.of(20,0, 1)) || hour.isBefore(LocalTime.of(6,0, 1));
        if(season.equals("Summer")) {
            return new Cabrio(isTurned);
        }
        else if(season.equals("Spring") || season.equals("Autumn")) {
            return new Sedan(isTurned);
        }
        else {
            return new SUV(isTurned);
        }
    }
}
