package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();

    Order order1 = new Order(50,  LocalDate.now(), "Login1");
    Order order2 = new Order(35, LocalDate.of(2019,04,04), "Login2");
    Order order3 = new Order(100, LocalDate.of(2021,05,05), "Login3");

    @BeforeEach
    public void addOrder(){
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @Test
    public void testAddOrder(){
        int numberOfOrders = shop.getSize();
        assertEquals(3,numberOfOrders);
    }

    @Test
    public void testOrderListTwoYears(){
        List<Order> orders = shop.orderListTwoYears(LocalDate.now());
        List<Order> twoYearsOrders = new ArrayList<>();
        twoYearsOrders.add(order1);
        twoYearsOrders.add(order3);
        assertEquals(twoYearsOrders, orders);
    }

    @Test
    public void testMinOrderValue(){
        List<Order> orders = shop.minOrderValue(35);
        List<Order> minOrder = new ArrayList<>();
        minOrder.add(order2);
        assertEquals(minOrder, orders);
    }

    @Test
    public void testMaxOrderValue(){
        List<Order> orders = shop.minOrderValue(100);
        List<Order> maxOrder = new ArrayList<>();
        maxOrder.add(order3);
        assertEquals(maxOrder, orders);
    }

    @Test
    public void testSize(){
        int numberOfOrders = shop.getSize();
        assertEquals(3,numberOfOrders);
    }

    @Test
    public void testTotalValue(){
        double totalValue = shop.getTotalValue();
        assertEquals(185,totalValue);
    }

}