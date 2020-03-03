package com.dao;

import com.domain.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderDao implements OrderDaoInterface {
    private List<Order> orders = new ArrayList<Order>();

    public OrderDao(){
        Order order1 = new Order();
        Order order2 = new Order();
        order1.setId(1);
        order2.setId(2);
        order1.setPrice(123d);
        order2.setPrice(12314.23);
        order1.setTitle("sadad");
        order2.setTitle("qweqwe");
        orders.add(order1);
        orders.add(order2);
    }


    public void save(Order order) {

    }

    public void delete() {

    }

    public List<Order> getAll() {
        return orders;
    }
}
