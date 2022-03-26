package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        double sumResult = calculator.sum(a,b);
        boolean correct = ResultChecker.assertEquals(13, sumResult, 0.1);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double subtractResult = calculator.subtract(a,b);
        boolean subCorrect = ResultChecker.assertEquals(-3,subtractResult, 0.1);
        if (subCorrect){
            System.out.println("Metoda działa poprawnie");
        } else {
            System.out.println("Meoda nie działa poprawnie");
        }

        double squaredResult = calculator.squared(a);
        boolean squaredCorrect = ResultChecker.assertEquals(25,squaredResult, 0.1);
        if (squaredCorrect){
            System.out.println("Metoda działa poprawnie");
        } else {
            System.out.println("Meoda nie działa poprawnie");
        }
    }
}
