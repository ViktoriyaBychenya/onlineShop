package com.bychenya.onlineShop.service;

import com.bychenya.onlineShop.dao.model.Orders;
import com.bychenya.onlineShop.dao.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImp implements OrderService{

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImp(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Orders> findAllOrder() {
        return orderRepository.findAll();
    }

    @Override
    public List<Orders> findAllOrderByStatus(String status) {
        return orderRepository.findByStatus(status);
    }

    @Override
    public List<Orders> findAllOrderByUserOrderId(int id) {
        return orderRepository.findByUserOrder_Id(id);
    }

    @Override
    public Orders findByIdOrder(int id) {
        return orderRepository.findById(id);
    }
}
