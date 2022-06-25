package com.bychenya.onlineShop.service;

import com.bychenya.onlineShop.dao.model.Sales;
import com.bychenya.onlineShop.dao.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImp implements SaleService{

    private final SaleRepository saleRepository;

    @Autowired
    public SaleServiceImp(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    @Override
    public List<Sales> findAllSale() {
        return saleRepository.findAll();
    }

    @Override
    public List<Sales> findAllSaleByOrderByDateOfPaymentAsc() {
        return saleRepository.findAllByOrderByDateOfPayment_Asc();
    }

    @Override
    public List<Sales> findByUserSale(int id) {
        return saleRepository.findByUserSale_IdOrderByDateOfPayment_Asc(id);
    }

}
