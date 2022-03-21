package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square();
        square.Area();
        square.Perimeter();

        Rectangle rectangle = new Rectangle();
        rectangle.Area();
        rectangle.Perimeter();

        Trapeze trapeze = new Trapeze();
        trapeze.Area();
        trapeze.Perimeter();
    }
}
