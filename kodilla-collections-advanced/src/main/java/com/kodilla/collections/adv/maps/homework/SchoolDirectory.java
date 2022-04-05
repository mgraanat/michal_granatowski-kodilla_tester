package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDirectory = new HashMap<>();
        Principal lewis = new Principal("Lewis", "Hamilton");
        Principal mick = new Principal("Mick", "Schumacher");
        Principal max = new Principal("Max", "Verstappen");

        School school1 = new School(20, 25, 30);
        School school2 = new School(10,35,28);
        School school3 = new School(29,23,20);

        schoolDirectory.put(lewis, school1);
        schoolDirectory.put(mick,school2);
        schoolDirectory.put(max,school3);

        for(Map.Entry<Principal, School> principalEntry : schoolDirectory.entrySet()){
            System.out.println(principalEntry.getKey().getFirstname() + " " + principalEntry.getKey().getLastname() + ", numbers of students" + " "+ principalEntry.getValue().getSum());
        }
    }
}
