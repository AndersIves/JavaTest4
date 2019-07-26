package com.hand.exam1.service;

import com.hand.exam1.pojo.Customer;

public interface ICustomerService {
    Boolean login(String name,String password);
    int insert(Customer customer);
    void update(Customer customer);
    void delete(int id);
}
