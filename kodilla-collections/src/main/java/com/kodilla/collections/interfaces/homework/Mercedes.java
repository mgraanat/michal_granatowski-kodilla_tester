package com.kodilla.collections.interfaces.homework;

public class Mercedes implements Car {

    private int speedMercedes;
    private int newSpeedMercedes;
    private int i = 0;
    private int increaseSpeed;
    private int decreaseSpeed;

    public Mercedes(int speedMercedes) {
        this.speedMercedes = speedMercedes;
    }

    @Override
    public int getSpeed() {
        newSpeedMercedes = increaseSpeed - decreaseSpeed + speedMercedes;
        return newSpeedMercedes;
    }

    @Override
    public void increaseSpeed() {
        for (i = 0; i < 3; i++) {
            increaseSpeed = increaseSpeed + 5;
        }
    }

    @Override
    public void decreaseSpeed() {
        for (i = 0; i < 2; i++) {
            decreaseSpeed = decreaseSpeed - 2;
        }
    }
}
