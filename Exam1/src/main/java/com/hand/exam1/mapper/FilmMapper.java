package com.hand.exam1.mapper;

import com.hand.exam1.pojo.Customer;
import com.hand.exam1.pojo.Film;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface FilmMapper extends Mapper<Film> {
    @Override
    int insert(Film film);

    @Override
    List<Film> selectAll();
}
