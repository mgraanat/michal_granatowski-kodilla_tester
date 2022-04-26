package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;

public class Warehouse {
    public  List<Order> orders = new ArrayList<>();

    public  Order addOrder(Order order) {
        orders.add(new Order(""));
        return new Order("");
    }

    public Order getOrder(String number) {
        Order order = new Order(number);
        return orders.stream()
                .filter(o -> o.getNumber().equals(number))
                .findAny()
                .orElse(null);
    }


    public boolean isOrderInUse (Order order) throws OrderDoesntExistException {
        if (orders.contains(order))
            return orders.contains(order);
        throw  new OrderDoesntExistException();
    }
}
