package com.kodilla.abstracts.homework;

public class Mechanic extends Job{
    public Mechanic() {
        super(3500, "Repair cars");

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
