package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class ClockTestSuite {

    @Test
    public void timeTest() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //when
        Clock firstBean = context.getBean(Clock.class);
        Clock secondBean = context.getBean(Clock.class);
        Clock thirdBean = context.getBean(Clock.class);
        //then
        Assertions.assertNotEquals(firstBean.getActualTime(), secondBean.getActualTime());
        Assertions.assertNotEquals(secondBean.getActualTime(), thirdBean.getActualTime());
        Assertions.assertNotEquals(firstBean.getActualTime(), thirdBean.getActualTime());
    }
}