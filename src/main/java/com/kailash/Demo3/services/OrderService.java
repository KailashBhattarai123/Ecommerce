package com.kailash.Demo3.services;

import com.kailash.Demo3.model.Orders;

import java.util.List;

public interface OrderService {
    void addOrder(Orders orders);

    List<Orders> getOrders();
}
