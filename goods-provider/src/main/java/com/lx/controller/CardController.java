package com.lx.controller;

import com.lx.bean.Cart;
import com.lx.bean.Goods;
import com.lx.dao.CardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author lx
 */
@RestController
public class CardController {
    @Autowired
    CardDao cardDao;

    @PostMapping("/saveCart")
    public Cart save(@RequestBody Cart cart){
        Cart save = cardDao.save(cart);
        System.out.println(save);
        return save;
    }

    @GetMapping("/deleteCart")
    public void delete(@RequestParam("id") Integer id){
        cardDao.deleteById(id);
    }

    @GetMapping("/selectAllCart")
    public List<Cart> selectAll(){
        List<Cart> all = cardDao.findAll();
        return all;
    }

    @GetMapping("/updateCart")
    public Cart update(Cart cart){
        Cart save = cardDao.save(cart);
        return save;
    }


}
