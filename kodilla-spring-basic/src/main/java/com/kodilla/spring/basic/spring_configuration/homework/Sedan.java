package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car{
    private boolean isTurned;

    public Sedan(boolean isTurned) {
        this.isTurned = isTurned;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return isTurned;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
