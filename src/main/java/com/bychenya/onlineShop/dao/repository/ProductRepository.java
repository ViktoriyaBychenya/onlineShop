package com.bychenya.onlineShop.dao.repository;

import com.bychenya.onlineShop.dao.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findAll();

    Product findProductById(int id);
}
