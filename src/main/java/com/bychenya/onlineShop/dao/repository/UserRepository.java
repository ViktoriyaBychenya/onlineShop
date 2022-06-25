package com.bychenya.onlineShop.dao.repository;

import com.bychenya.onlineShop.dao.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    List<User> findAll();

    User findById(int id);
}
