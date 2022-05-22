package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        NotificationInterface notificationInterface = new NotificationService();
        DeliveryInterface deliveryInterface = new DeliveryService();
        ShippingCenter application = new ShippingCenter(notificationInterface, deliveryInterface);
        application.sendPackage("Hill Street 11, New York", 18.2);
    }
}