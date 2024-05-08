package com.kailash.Demo3.services;

import com.kailash.Demo3.dao.OrderRpository;
import com.kailash.Demo3.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderRpository orderRpository;

    @Override
    public void addOrder(Orders orders) {
        orderRpository.save(orders);
    }

    @Override
    public List<Orders> getOrders() {
        List<Orders> orders = orderRpository.findAll();
        return orders;
    }
}
