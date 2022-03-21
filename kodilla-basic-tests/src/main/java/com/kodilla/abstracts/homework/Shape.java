package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int sideA;
    private int sideB;
    private int sideC;
    private int heightH;

    public Shape(int sideA, int sideB,int sideC, int heightH) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.heightH = heightH;
    }

    public int getSideA() {
        return sideA;
    }
    public int getSideB() {
        return sideB;
    }
    public int getHeightH(){
        return heightH;
    }
    public int getSideC(){
        return sideC;
    }

    public abstract void Area();

    public abstract void Perimeter();
}