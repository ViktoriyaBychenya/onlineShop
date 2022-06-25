package com.bychenya.onlineShop.service;

import com.bychenya.onlineShop.dao.model.Sales;

import java.util.List;

public interface SaleService {

    List<Sales> findAllSale();

    List<Sales> findAllSaleByOrderByDateOfPaymentAsc();

    List<Sales> findByUserSale(int id);
}
