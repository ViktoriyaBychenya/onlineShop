package com.bychenya.onlineShop.web.controller;

import com.bychenya.onlineShop.dao.model.BlackList;
import com.bychenya.onlineShop.dao.model.Cart;
import com.bychenya.onlineShop.service.BlackListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class BlackListController  {

    private final BlackListService blackListService;

    @Autowired
    public BlackListController(BlackListService blackListService) {
        this.blackListService = blackListService;
    }

    @GetMapping("/blackList/all")
    public String getAllBlackList(Model model) {
        List<BlackList> allBlackList = blackListService.findAllBlackList();
        model.addAttribute("allBlackList", allBlackList);
        return "blackList";
    }

    @GetMapping("/blackList/{userBlackList}")
    public String getBlackListOfUser(Model model, @PathVariable("userBlackList") int id) {
        BlackList blackListUser = blackListService.findBlackListByUserId(id);
        model.addAttribute("blackListUser", blackListUser);
        return "blackList";
    }
}
