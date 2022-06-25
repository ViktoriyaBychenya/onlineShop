package com.bychenya.onlineShop.service;

import com.bychenya.onlineShop.dao.model.Cart;
import com.bychenya.onlineShop.dao.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImp implements CartService{

    private CartRepository cartRepository;

    @Autowired
    public CartServiceImp(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public List<Cart> findCartByUserId(int id) {
        return cartRepository.findByUserId(id);
    }

    @Override
    public List<Cart> findAllCart() {
        return cartRepository.findAll();
    }

}
