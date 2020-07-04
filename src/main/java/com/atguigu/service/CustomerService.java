package com.atguigu.service;

import com.atguigu.domin.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findCustomers();
    Customer findCustomerById(Integer id);
    void saveCustomer(Customer Customer);
    void updateCustomer(Customer Customer);
    void deleteCustomerById(Integer id);
}
