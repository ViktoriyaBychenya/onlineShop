package com.bychenya.onlineShop.web.controller;

import com.bychenya.onlineShop.dao.model.Product;
import com.bychenya.onlineShop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products/all")
    public String getAllProduct(Model model) {
        List<Product> allProducts = productService.findAllProduct();
        model.addAttribute("productsall", allProducts);
        return "products";
    }

    @GetMapping("/products/{id}")  // по id продукта выводятся корзины, в которых присутствует этот продукт
    public String getProductById(Model model, @PathVariable("id") int id) {
        Product product = productService.findProductById(id);
        model.addAttribute("someProduct", product);
        return "products";
    }
}
