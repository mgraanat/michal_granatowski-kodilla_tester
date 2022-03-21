package com.kodilla.abstracts.homework;

public class Footballer extends Job{
    public Footballer() {
        super(50000, "Running on the pitch");
    }

    @Override
    public void Responsibilities() {
        System.out.println(getResponsibilities());

    }

    @Override
    public void Salary() {
        System.out.println(getSalary());

    }
}
