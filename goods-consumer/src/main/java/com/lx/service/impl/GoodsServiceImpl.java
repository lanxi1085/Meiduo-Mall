package com.lx.service.impl;

import com.lx.bean.Cart;
import com.lx.bean.Goods;
import com.lx.service.GoodsService;
import com.lx.vo.R;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author lx
 */
public class GoodsServiceImpl implements GoodsService {



    @Override
    public R selectAll(Integer page, Integer pagesize) {
        return null;
    }

    @Override
    public R selectAllByName(String name, Integer page) {
        return null;
    }


    @Override
    public Goods selectById(Integer id) {
        return null;
    }

    @Override
    public Cart insert(Cart cart) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Cart> selectAll() {
        return null;
    }

    @Override
    public Cart update(Cart cart) {
        return null;
    }
}
