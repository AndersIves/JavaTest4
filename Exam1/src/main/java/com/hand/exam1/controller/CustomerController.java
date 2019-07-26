package com.hand.exam1.controller;

import com.hand.exam1.pojo.Customer;
import com.hand.exam1.service.ICustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/customer")
public class CustomerController  {
    @Autowired
    private ICustomerService customerService;

    private Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @PostMapping("/login")
    public String login(String name,String password){
        logger.info("login customer "+name+" "+password);
        if(customerService.login(name,password)){
            return "success login";
        }
        else {
            return "failed login";
        }
    }

    @PostMapping("/insert")
    public int insert(Customer customer){
        logger.info("insert customer "+customer);
        return customerService.insert(customer);
    }

    @PutMapping("/update")
    public Customer update(Customer customer){
        logger.info("update customer "+customer);
        customerService.update(customer);
        return customer;
    }

    @DeleteMapping("/delete")
    public void delete(int id){
        logger.info("delete customer "+id);
        customerService.delete(id);
    }

}
