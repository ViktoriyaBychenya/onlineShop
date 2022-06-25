package com.bychenya.onlineShop.service;

import com.bychenya.onlineShop.dao.model.BlackList;
import com.bychenya.onlineShop.dao.repository.BlackListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlackListServiceImp implements BlackListService{

    private final BlackListRepository blackListRepository;

    @Autowired
    public BlackListServiceImp(BlackListRepository blackListRepository) {
        this.blackListRepository = blackListRepository;
    }

    @Override
    public List<BlackList> findAllBlackList() {
        return blackListRepository.findAllByOrderByDebtDesc();
    }

    @Override
    public BlackList findBlackListByUserId(int id) {
        return blackListRepository.findBlackListByUserBlackListId(id);
    }
}
