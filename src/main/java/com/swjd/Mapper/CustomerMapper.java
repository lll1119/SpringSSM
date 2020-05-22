package com.swjd.Mapper;

import com.swjd.bean.Customer;

import java.util.List;

public interface CustomerMapper {
    //查询
    public abstract List<Customer> getAll();
}
