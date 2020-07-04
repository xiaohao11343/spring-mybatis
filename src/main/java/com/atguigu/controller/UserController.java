package com.atguigu.controller;

import com.atguigu.domin.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")

    public List<User> findAll(){
        System.out.println(userService.getClass());
        return userService.findAll();
    }
}