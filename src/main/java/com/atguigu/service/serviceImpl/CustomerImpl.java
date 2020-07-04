package com.atguigu.service.serviceImpl;

import com.atguigu.dao.CustomerDao;
import com.atguigu.domin.Customer;
import com.atguigu.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerImpl implements CustomerService {
    @Autowired
    CustomerDao customerDao;

    @Override
    public List<Customer> findCustomers() {
        return customerDao.findAll();
    }

    @Override
    public Customer findCustomerById(Integer id) {
        return customerDao.findById(id).get();
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerDao.save(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerDao.save(customer);
    }

    @Override
    public void deleteCustomerById(Integer id) {
        customerDao.deleteById(id);
    }
}
