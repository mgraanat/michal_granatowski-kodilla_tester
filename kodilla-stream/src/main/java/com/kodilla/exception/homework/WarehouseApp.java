package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order1"));
        warehouse.addOrder(new Order("Order2"));
        warehouse.addOrder(new Order("Order3"));

        try {
            boolean isOrderCorrect = warehouse.getOrder(String.valueOf(new Order("Order5")));
            System.out.println("Order correct");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order not correct");
        }
    }
}
