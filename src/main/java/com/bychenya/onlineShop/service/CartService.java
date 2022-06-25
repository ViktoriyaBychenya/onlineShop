package com.bychenya.onlineShop.service;

import com.bychenya.onlineShop.dao.model.Cart;
import java.util.List;

public interface CartService {

    List<Cart> findCartByUserId(int id);

    List<Cart> findAllCart();
}
