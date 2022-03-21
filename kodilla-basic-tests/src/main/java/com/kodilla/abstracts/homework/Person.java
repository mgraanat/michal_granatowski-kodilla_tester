package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    String job;

    public Person (String firstName, int age, String job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {
        Person Michal = new Person("Michal", 25, "Mechanic");
        Person Daniel = new Person("Daniel", 50, "Doctor");
        Person Cristiano = new Person("Cristiano", 37, "Footballer");

        Person[] persons = {Michal,Daniel,Cristiano};


    }
}
