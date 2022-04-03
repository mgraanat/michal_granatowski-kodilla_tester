package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String name;
    private double dimensionA;
    private double dimensionB;
    private String stamped;

    public Stamp(String name, double dimensionA, double dimensionB, String stamped) {
        this.name = name;
        this.dimensionA = dimensionA;
        this.dimensionB = dimensionB;
        this.stamped = stamped;
    }

    public String getName() {
        return name;
    }

    public double getDimensionA() {
        return dimensionA;
    }

    public double getDimensionB() {
        return dimensionB;
    }

    public String getStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.dimensionA, dimensionA) == 0 && Double.compare(stamp.dimensionB, dimensionB) == 0 && Objects.equals(name, stamp.name) && Objects.equals(stamped, stamp.stamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dimensionA, dimensionB, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", dimensionA=" + dimensionA +
                ", dimensionB=" + dimensionB +
                ", stamped='" + stamped + '\'' +
                '}';
    }
}
