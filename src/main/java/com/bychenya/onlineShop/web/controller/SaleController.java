package com.bychenya.onlineShop.web.controller;

import com.bychenya.onlineShop.dao.model.Sales;
import com.bychenya.onlineShop.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class SaleController {

    private final SaleService saleService;

    @Autowired
    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }

    @GetMapping("/sales/all")
    public String getAllSale(Model model) {
        List<Sales> allSale = saleService.findAllSale();
        model.addAttribute("allSale", allSale);
        return "sales";
    }

    @GetMapping("/sales/allDate")
    public String getAllSaleByOrderDateAsc(Model model) {
        List<Sales> allSale = saleService.findAllSaleByOrderByDateOfPaymentAsc();
        model.addAttribute("allSale", allSale);
        return "sales";
    }

    @GetMapping("/sales/{userSale}")
    public String getAllSaleByUser(Model model, @PathVariable("userSale") int id) {
        List<Sales> allSale = saleService.findByUserSale(id);
        model.addAttribute("allSale", allSale);
        return "sales";
    }
}
