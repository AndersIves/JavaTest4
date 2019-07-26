package com.hand.exam1.mapper;

import com.hand.exam1.pojo.Customer;
import com.hand.exam1.pojo.Film;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface FilmMapper extends Mapper<Film> {
    @Override
    int insert(Film film);
}
