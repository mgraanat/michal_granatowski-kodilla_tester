package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public static void main(String[] args) {
        Person Michal = new Person("Michal", 25);
        Person Daniel = new Person("Daniel", 50);
        Person Cristiano = new Person("Cristiano", 37);

        Person[] persons = {Michal, Daniel, Cristiano};

        Job mechanic = new Mechanic();

        System.out.println(Michal.firstName);
        System.out.println(mechanic.getResponsibilities());


    }
}
