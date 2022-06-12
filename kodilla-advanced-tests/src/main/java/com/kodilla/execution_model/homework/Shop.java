package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public void orderListTwoYears(LocalDate now, LocalDate twoYears) {
        twoYears = now.minusYears(2);
        for (int i = 0; i <= orders.size(); i++) {
        }
    }


    public int minOrderValue() {
        int min = 0;
        for (int i = 0; i <= orders.size(); i++) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public int maxOrderValue() {
        int max = 0;
        for (int i = 0; i <= orders.size(); i++) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public int getSize() {
        return this.orders.size();
    }

    public double getTotalValue() {
        int sum = 0;
        for (int i = 0; i < orders.size(); i++) {
            sum = sum + 1;
            sum += orders.get(i).getOrderValue();
        }
        return sum;
    }
}
