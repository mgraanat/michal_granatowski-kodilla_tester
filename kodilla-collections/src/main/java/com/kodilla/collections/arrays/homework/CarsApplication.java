package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar(){
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        int speed = random.nextInt() * 10;
        if (drawnCarKind == 0)
            return new Mercedes(speed);
        else if (drawnCarKind == 1)
            return new BMW(speed);
        else
            return new Audi(speed);
    }
}
