package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {

    private DeliveryInterface deliveryService;
    private NotificationService notificationService;

    public ShippingCenter(DeliveryInterface deliveryService, NotificationService notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    public void sendPackage(String address, double weight) {
        if (deliveryService.send(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}
