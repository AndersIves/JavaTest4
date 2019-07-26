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
    public String login(@RequestParam("name") String name,@RequestParam("password") String password){
        logger.info("login customer "+name+" "+password);
        if(customerService.login(name,password)){
            return "success login";
        }
        else {
            return "failed login";
        }
    }

    @PostMapping("/")
    public int insert(@RequestBody Customer customer){
        logger.info("insert customer "+customer);
        return customerService.insert(customer);
    }

    @PutMapping("/{customerId}")
    public Customer update(@PathVariable("customerId") int id,@RequestBody Customer customer){
        logger.info("update customer "+customer);
        customerService.update(id,customer);
        return customer;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        logger.info("delete customer "+id);
        customerService.delete(id);
    }

}
