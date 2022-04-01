package com.kodilla.abstracts.homework;

public class Person {
    public String firstName;
    public int age;
    private Job job;


    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;

    }

        Person Michal = new Person("Michal", 25, job);
        Person Daniel = new Person("Daniel", 50, job);
        Person Cristiano = new Person("Cristiano", 37, job);

        Person[] persons = {Michal, Daniel, Cristiano};

}
