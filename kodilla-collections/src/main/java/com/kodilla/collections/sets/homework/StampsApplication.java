package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Stamp1", 5.0, 5.0, "yes"));
        stamps.add(new Stamp("Stamp2", 4.0, 3.0, "yes"));
        stamps.add(new Stamp("Stamp3", 5.5,4.5, "no"));
        stamps.add(new Stamp("Stamp2",4.0, 3.0, "yes"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);

    }
}
