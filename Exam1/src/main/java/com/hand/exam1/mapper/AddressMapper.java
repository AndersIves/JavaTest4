package com.hand.exam1.mapper;

import com.hand.exam1.pojo.Address;
import com.hand.exam1.pojo.Customer;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface AddressMapper extends Mapper<Address> {
    List<Address> selectById(long id);
}
