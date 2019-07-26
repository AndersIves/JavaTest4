package com.hand.exam1.service.impl;

import com.hand.exam1.mapper.AddressMapper;
import com.hand.exam1.mapper.CustomerMapper;
import com.hand.exam1.pojo.Address;
import com.hand.exam1.pojo.Customer;
import com.hand.exam1.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public Boolean login(String name, String password) {
        Customer customer = new Customer();
        customer.setFirstName(name);
        customer.setLastName(password);
        List<Customer> customers = customerMapper.select(customer);
        if(customers.size()!=0){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int insert(Customer customer) {
        List<Address> address = addressMapper.selectById(customer.getAddressId());
        if(address.size()!=0){
            customerMapper.insert(customer);
            return (int)customer.getCustomerId();
        }
        else {
            return -1;
        }
    }

    @Override
    public void update(Customer customer) {
        customerMapper.update(customer);
    }

    @Override
    public void delete(int id) {
        customerMapper.deleteById(id);
    }
}
