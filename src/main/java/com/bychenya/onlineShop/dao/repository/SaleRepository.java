package com.bychenya.onlineShop.dao.repository;

import com.bychenya.onlineShop.dao.model.Sales;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends CrudRepository<Sales, Integer> {

    List<Sales> findAll();

    List<Sales> findAllByOrderByDateOfPayment_Asc();

    List<Sales> findByUserSale_IdOrderByDateOfPayment_Asc(int id);
}
