package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    private Job job() {
        Job mechanic = new Mechanic();
        Job doctor = new Doctor();

        return mechanic;
    }

    public static void main(String[] args) {
        Person Michal = new Person("Michal", 25);
        Person Daniel = new Person("Daniel", 50);
        Person Cristiano = new Person("Cristiano", 37);

        Person[] persons = {Michal, Daniel, Cristiano};

        System.out.println(Michal.firstName);


    }
}
