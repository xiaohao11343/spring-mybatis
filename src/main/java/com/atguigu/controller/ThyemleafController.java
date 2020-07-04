package com.atguigu.controller;

import com.atguigu.domin.Customer;
import com.atguigu.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.hash.HashMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/test")
@Controller
public class ThyemleafController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("hello","hello welcome");
        return "demo1";
    }
    @RequestMapping("/hello2")
    public String hello2(Model model){
        model.addAttribute("hello","hello welcome");
        List<Customer> customers = customerService.findCustomers();
        model.addAttribute("users",customers);

        Map<Object, Object> map = new HashMap<>();
        map.put("111","1111");
        map.put("222","2222");
        map.put("333","3333");
        model.addAttribute("map",map);
        return "demo2";
    }

}
