package com.mrfan.controller;

import com.mrfan.model.User;
import com.mrfan.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @RequestMapping(value = "/toLogin", method = RequestMethod.GET)
    public String toLogin(Model model, String id) {
        return "UserLogin";
    }

    @RequestMapping(value = "/toRegister", method = RequestMethod.GET)
    public String toRegister(Model model, String id) {
        return "UserRegister";
    }

    @RequestMapping(value = "/queryById", method = RequestMethod.POST)
    public String queryById(Model model, String id,String password) {
        int userId = Integer.parseInt(id);
        String next =userService.userLogin(userId,password);

        model.addAttribute("");
        return next;
    }
}
