package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car{
    private boolean isTurned;

    public Cabrio(boolean isTurned) {
        this.isTurned = isTurned;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return isTurned;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
