package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        DeliveryInterface deliveryService = new DeliveryService();
        ShippingCenter application = new ShippingCenter(deliveryService, notificationService);
        application.sendPackage("Hill Street 11, New York", 18.2);
    }
}