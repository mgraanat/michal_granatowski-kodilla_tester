package com.kodilla.abstracts.homework;

public class Square extends Shape{
    public Square() {
        super(4,0,0,0);
    }

    @Override
    public void Area() {
        int areaSquare = getSideA() * getSideA();
        System.out.println(areaSquare);
    }

    @Override
    public void Perimeter() {
        int perimeterSquare = 4 * getSideA();
        System.out.println(perimeterSquare);
    }
}
