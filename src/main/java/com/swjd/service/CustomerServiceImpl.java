package com.swjd.service;

import com.swjd.Mapper.CustomerMapper;
import com.swjd.bean.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerMapper customerMapper;
    @Override
    public List<Customer> getAll() {
        return customerMapper.getAll();
    }
}
