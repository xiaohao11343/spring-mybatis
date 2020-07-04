package com.atguigu.controller;

import com.atguigu.domin.Customer;
import com.atguigu.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("findAll")
    public List<Customer> findAll(){
        List<Customer> customers = customerService.findCustomers();
        System.out.println("customers = " + customers);
        return customers;
    }



}
