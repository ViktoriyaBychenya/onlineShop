package com.bychenya.onlineShop.service;

import com.bychenya.onlineShop.dao.model.Product;
import com.bychenya.onlineShop.dao.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService{

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product findProductById(int id) {
        return productRepository.findProductById(id);
    }
}
