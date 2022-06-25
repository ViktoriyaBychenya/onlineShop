package com.bychenya.onlineShop.dao.repository;

import com.bychenya.onlineShop.dao.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer> {

    List<Cart> findByUserId(int id);

    List<Cart> findAll();
}
