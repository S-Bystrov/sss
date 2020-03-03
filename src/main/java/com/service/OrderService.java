package com.service;

import com.dao.OrderDao;
import com.dao.OrderDaoInterface;
import com.domain.Order;

import java.util.List;

public class OrderService implements OrderServiceInterface {

    private OrderDaoInterface orderDao = new OrderDao();

    @Override
    public List<Order> getAll() {
        return orderDao.getAll();
    }
}
