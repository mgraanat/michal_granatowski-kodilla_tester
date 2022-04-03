package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;

import java.util.ArrayList;
import java.util.List;

public class CarsApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        BMW bmw = new BMW(6);
        cars.add(new Mercedes(7));
        cars.add(new Audi(4));
        cars.add(bmw);

        System.out.println(cars.size());
        for (Car car : cars) {
            System.out.println(CarUtils.describeCar(car));
        }

        cars.remove(1);
        cars.remove(bmw);

        System.out.println(cars.size());
        for (Car car : cars) {
            System.out.println(CarUtils.describeCar(car));
        }
    }
}
