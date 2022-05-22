package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public Double add(double a, double b){
       display.display(a+b);
        return this.display.display(a+b);
    }
}
