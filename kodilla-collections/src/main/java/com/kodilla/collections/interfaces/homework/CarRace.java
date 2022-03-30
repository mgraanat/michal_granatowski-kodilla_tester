package com.kodilla.collections.interfaces.homework;

import java.sql.SQLOutput;

public class CarRace {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes(1);
        showMercedes(mercedes);
        BMW bmw = new BMW(1);
        Audi audi = new Audi(1);
    }

    public static void showMercedes(Car car){
        System.out.println(car.getSpeed());
    }
}
