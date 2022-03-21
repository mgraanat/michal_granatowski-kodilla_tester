package com.kodilla.inheritance.homework;

public class ActionCode {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1990);
        operatingSystem.turnOn();

        SystemMacOs systemMacOs = new SystemMacOs(2000);
        SystemWindows systemWindows = new SystemWindows(2005);

        operatingSystem.turnOff();
    }
    }
