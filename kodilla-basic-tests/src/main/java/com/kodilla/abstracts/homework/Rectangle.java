package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    public Rectangle() {
        super(4, 5,0,0);
    }

    @Override
    public void Area() {
        int areaRectangle = getSideA() * getSideB();
        System.out.println(areaRectangle);

    }

    @Override
    public void Perimeter() {
        int perimeterRectangle = 2 * getSideA() + 2 * getSideB();
        System.out.println(perimeterRectangle);

    }
}
