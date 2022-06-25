package com.bychenya.onlineShop.service;


import com.bychenya.onlineShop.dao.model.Orders;
import java.util.List;

public interface OrderService {

    List<Orders> findAllOrder();

    List<Orders> findAllOrderByStatus(String status);

    List<Orders> findAllOrderByUserOrderId(int id);

    Orders findByIdOrder(int id);
}
