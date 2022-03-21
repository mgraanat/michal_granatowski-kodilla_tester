package com.kodilla.abstracts.homework;

public class Trapeze extends Shape{
    public Trapeze() {
        super(3,4,5,6);
    }

    @Override
    public void Area() {
        int areaTrapeze = ((getSideA()+getSideB())*getHeightH())/2;
        System.out.println(areaTrapeze);

    }

    @Override
    public void Perimeter() {
        int perimeterTrapeze = getSideA()+getSideB()+2*getSideC();
        System.out.println(perimeterTrapeze);

    }
}
