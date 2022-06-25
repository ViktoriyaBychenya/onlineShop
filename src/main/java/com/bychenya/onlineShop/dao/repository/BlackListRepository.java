package com.bychenya.onlineShop.dao.repository;

import com.bychenya.onlineShop.dao.model.BlackList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlackListRepository extends CrudRepository<BlackList, Integer> {

    List<BlackList> findAll();

    List<BlackList> findAllByOrderByDebtDesc();

    BlackList findBlackListByUserBlackListId(int id);
}
