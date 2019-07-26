package com.hand.exam1.mapper;

import com.hand.exam1.pojo.Customer;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface CustomerMapper extends Mapper<Customer> {
    @Override
    int insert(Customer customer);

    void update(Customer customer);

    int deleteById(long id);
}
