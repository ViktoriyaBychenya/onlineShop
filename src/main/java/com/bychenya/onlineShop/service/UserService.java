package com.bychenya.onlineShop.service;

import com.bychenya.onlineShop.dao.model.User;
import java.util.List;

public interface UserService {

    List<User> findAllUsers();

    User findUserById(int id);
}
