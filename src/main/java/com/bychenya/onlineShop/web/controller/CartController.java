package com.bychenya.onlineShop.web.controller;

import com.bychenya.onlineShop.dao.model.Cart;
import com.bychenya.onlineShop.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CartController {

    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/cart/all")
    public String getAllProductOfCart(Model model) {
        List<Cart> allProductsInCart = cartService.findAllCart();
        model.addAttribute("allProductInCart", allProductsInCart);

        return "cart";
    }

    @GetMapping("/cart/{user}")
    public String getAllProductOfCartUser(Model model, @PathVariable("user") int id) {
        List<Cart> allProductsInCartOfUser = cartService.findCartByUserId(id);
        model.addAttribute("allProductsInCart", allProductsInCartOfUser);
        double summaInCart = 0;
        for (Cart cart : allProductsInCartOfUser) {
            summaInCart = summaInCart + cart.getQuantity() * cart.getProduct().getPrice();
        }
        model.addAttribute("summa", summaInCart);
        return "cart";
    }
}
