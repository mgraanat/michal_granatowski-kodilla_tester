package com.kodilla.abstracts.homework;

public class Doctor extends Job {
    public Doctor() {
        super(10000, "Healing people");
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
