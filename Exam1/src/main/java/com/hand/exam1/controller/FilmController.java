package com.hand.exam1.controller;

import com.hand.exam1.anno.AnnPage;
import com.hand.exam1.pojo.Film;
import com.hand.exam1.pojo.Page;
import com.hand.exam1.service.impl.FilmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/film")
public class FilmController {
    private Logger logger = LoggerFactory.getLogger(CustomerController.class);
    @Autowired
    private FilmService filmService;
    @GetMapping("/")
    public List<Film> list(@AnnPage("page") Page page){
        logger.info("select film by "+page);
        return filmService.selectByPage(page);
    }
    @PostMapping("/")
    public long insert(@RequestBody Film film){
        logger.info("insert into film "+film);
        return filmService.insert(film);
    }
}
