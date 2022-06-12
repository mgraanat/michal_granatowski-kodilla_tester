package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();

    Order order1 = new Order(50,  LocalDate.now(), "Login1");
    Order order2 = new Order(35, LocalDate.of(2020,04,04), "Login2");
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

}