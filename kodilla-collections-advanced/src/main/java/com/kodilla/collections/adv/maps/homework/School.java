package com.kodilla.collections.adv.maps.homework;


import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Double> schools = new ArrayList<>();

    public School(double... schools){
        for(double school : schools)
            this.schools.add(school);
    }
    public int getSum(){
        int sum = 0;
        for (double school : schools)
            sum += school;
        return sum;
    }
}
