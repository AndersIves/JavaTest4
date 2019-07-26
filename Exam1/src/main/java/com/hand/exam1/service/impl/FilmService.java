package com.hand.exam1.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.exam1.mapper.FilmMapper;
import com.hand.exam1.pojo.Film;
import com.hand.exam1.pojo.Page;
import com.hand.exam1.service.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService implements IFilmService {
    @Autowired
    FilmMapper filmMapper;
    @Override
    public long insert(Film film) {
        filmMapper.insert(film);
        return film.getFilmId();
    }

    @Override
    public List<Film> selectByPage(Page page) {
        PageHelper.startPage(page.getPage(),page.getPageSize());
        List<Film> films = filmMapper.selectAll();
        return films;
    }
}
