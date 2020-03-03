package com.dao;

import com.domain.Order;

import java.util.List;

public interface OrderDaoInterface {
/*    void save();
    void delete();*/
    List<Order> getAll();
}
