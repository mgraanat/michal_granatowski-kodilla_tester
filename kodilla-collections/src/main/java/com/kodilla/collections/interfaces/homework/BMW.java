package com.kodilla.collections.interfaces.homework;

public class BMW implements Car {

    private int speed;

    public BMW(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 8;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 2;
    }
}
