package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Order> orders = new ArrayList<>();


    public void addOrder(Order order) {

        this.orders.add(order);
    }

    public List<Order> orderListTwoYears(LocalDate now) {
        LocalDate twoYears = now.minusYears(2);
        for (Order order : orders) {
            if (order.getDate().isAfter(LocalDate.now()) && order.getDate().isBefore(twoYears)) {
                orders.add(order);
            }
        }
        return orders;
    }


    public List<Order> minOrderValue(int minOrderValue) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            if (order.orderValue == minOrderValue) {
                result.add(order);
            }
        } return result;

    }

    public List<Order> maxOrderValue(int maxOrderValue) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            if (order.orderValue == maxOrderValue) {
                result.add(order);
            }
        } return result;
    }

    public int getSize() {

        return this.orders.size();
    }

    public int getTotalValue() {
        return orders.stream()
                .map(Order::getOrderValue)
                .mapToInt(Integer:: intValue)
                .sum();
    }
}
