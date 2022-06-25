package com.bychenya.onlineShop.web.controller;

import com.bychenya.onlineShop.dao.model.User;
import com.bychenya.onlineShop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/all")
    public String getAllUser(Model model) {
        List<User> allUsers = userService.findAllUsers();
        model.addAttribute("allUsers", allUsers);
        return "user";
    }

    @GetMapping("/user/{id}")  // по id юзера выводится информация о юзере
    public String getUserById(Model model, @PathVariable("id") int id) {
        User user = userService.findUserById(id);
        model.addAttribute("someUser", user);
        return "user";
    }
}
