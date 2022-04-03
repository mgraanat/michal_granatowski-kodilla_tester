package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;

public class CarUtils {
    public static char describeCar(Car car){
        System.out.println("Car brand: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
        return '-';
    }
    public static String getCarName(Car car){
        if (car instanceof Mercedes)
            return "Mercedes";
        else if (car instanceof BMW)
            return "BMW";
        else if (car instanceof Audi)
            return "Audi";
        else
            return "Unknown car name";
    }


}
