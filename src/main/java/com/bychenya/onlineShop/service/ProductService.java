package com.bychenya.onlineShop.service;

import com.bychenya.onlineShop.dao.model.Product;
import  java.util.List;

public interface ProductService {

    List<Product> findAllProduct();

    Product findProductById(int id);
}
