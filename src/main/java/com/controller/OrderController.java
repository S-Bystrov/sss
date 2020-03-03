package com.controller;

import com.domain.Order;
import com.service.OrderService;
import com.service.OrderServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;

@Controller
public class OrderController {

    private OrderServiceInterface orderService = new OrderService();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getOrder(Model model){
        List<Order> orders = orderService.getAll();
        model.addAttribute("orderList", orders);
        return "order";
    }

    public String insertOrder(){
        return "";
    }

    public String deleteOrder(){
        return "";
    }
}
