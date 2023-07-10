package com.lx.controller;

import com.lx.bean.Goods;
import com.lx.bean.RestPage;
import com.lx.dao.CardDao;
import com.lx.dao.GoodsDao;
import com.lx.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;


/**
 * @author lx
 */


@RestController
public class GoodsController {
    @Autowired
    GoodsDao goodsDao;



    @GetMapping("/selectAll")
    public R selectAll(@RequestParam("page") Integer page, @RequestParam("pagesize")Integer pagesize){

        Pageable pageable= PageRequest.of(page-1, pagesize);

        Page<Goods> all = goodsDao.findAll(pageable);

        all.forEach(System.out::println);

        return new R(all);
    }

    @GetMapping("/selectAllByName")
    public R selectAllByName(@RequestParam("name") String name,@RequestParam("page") Integer page){
        System.out.println(name);
        Pageable pageable= PageRequest.of(page-1, 4);
        Goods goods=new Goods();
        goods.setGname(name);
        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);

        Page<Goods> all= goodsDao.findAll(Example.of(goods,exampleMatcher),pageable);
        return new R(all);
    }

    @GetMapping ("/findById")
    public Goods selectById(@RequestParam("id") Integer id){
        Optional<Goods> byId = goodsDao.findById(id);
        return byId.get();
    }





}
