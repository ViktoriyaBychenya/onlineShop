package com.bychenya.onlineShop.service;

import com.bychenya.onlineShop.dao.model.BlackList;

import java.util.List;

public interface BlackListService {

    List<BlackList> findAllBlackList();

    BlackList findBlackListByUserId(int id);
}
