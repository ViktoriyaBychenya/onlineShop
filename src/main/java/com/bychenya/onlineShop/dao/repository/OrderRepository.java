package com.bychenya.onlineShop.dao.repository;

import com.bychenya.onlineShop.dao.model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Integer> {

    List<Orders> findAll();

    List<Orders> findByStatus(String status);  // по статусу

    List<Orders> findByUserOrder_Id(int id);   // по пользователю

    Orders findById(int id);   //  по номеру заказа
}
