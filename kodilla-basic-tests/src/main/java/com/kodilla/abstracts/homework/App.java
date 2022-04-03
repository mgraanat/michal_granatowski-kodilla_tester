package com.kodilla.abstracts.homework;

public class App {
    public static void main(String[] args) {
        Job mechanic = new Mechanic();
        Job doctor = new Doctor();
        Job footballer = new Footballer();

        Person Michal = new Person("Michal", 25, mechanic);
        Person Daniel = new Person("Daniel", 50, doctor);
        Person Cristiano = new Person("Cristiano", 37, footballer);

        Person[] persons = {Michal, Daniel, Cristiano};

        System.out.println(Michal.firstName + " " + mechanic.getResponsibilities() + " " + mechanic.getSalary());


    }
}
