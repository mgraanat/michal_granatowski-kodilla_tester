package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Car mercedes = new Mercedes(4);
        doRace(mercedes);
        Car bmw = new BMW(3);
        doRace(bmw);
        Car audi = new Audi(2);
        doRace(audi);

    }

    public static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        car.getSpeed();
        System.out.println(car.getSpeed());
    }
}
