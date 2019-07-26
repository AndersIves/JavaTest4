package com.hand.exam1.service;

import com.hand.exam1.pojo.Film;
import com.hand.exam1.pojo.Page;

import java.util.List;

public interface IFilmService {
    long insert(Film film);
    List<Film> selectByPage(Page page);
}
