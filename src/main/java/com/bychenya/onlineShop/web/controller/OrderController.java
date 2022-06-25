package com.bychenya.onlineShop.web.controller;

import com.bychenya.onlineShop.dao.model.Orders;
import com.bychenya.onlineShop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/order/all")
    public String getAllOrder(Model model) {
        List<Orders> allOrders = orderService.findAllOrder();
        model.addAttribute("allOrders", allOrders);
        return "order";
    }

    @GetMapping("/orders/{status}")
    public String getAllOrderByStatus(Model model, @PathVariable("status") String status) {
        List<Orders> allOrdersByStatus = orderService.findAllOrderByStatus(status);
        model.addAttribute("allOrders", allOrdersByStatus);
        return "order";
    }

    @GetMapping("/user/orders/{userOrder}")
    public String getAllOrderByUserId(Model model, @PathVariable("userOrder") int id) {
        List<Orders> allOrdersByUserId = orderService.findAllOrderByUserOrderId(id);
        model.addAttribute("allOrders", allOrdersByUserId);
        return "order";
    }

    @GetMapping("/order/{id}")
    public String getAllOrderById(Model model, @PathVariable("id") int id) {
        Orders OrderById = orderService.findByIdOrder(id);
        model.addAttribute("allOrders", OrderById);
        return "order";
    }
}
