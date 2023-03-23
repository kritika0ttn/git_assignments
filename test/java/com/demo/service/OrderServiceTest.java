package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OrderServiceTest {
    @Test
    public void testorderGetInstance() {
        OrderService or = OrderService.getInstance();
        assertTrue(or instanceof OrderService);
    }

    @Test
    public void testplaceOrder(){
        Order or1=new Order(35,"ethan collhan",350);
        assertTrue(OrderService.getInstance().placeOrder(or1,"Part one"));

    }
}
