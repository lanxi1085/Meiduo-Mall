package com.lx.controller;

import com.lx.bean.Cart;
import com.lx.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CartContro {

    @Autowired
    GoodsService goodsService;



    @PostMapping("insert")
    public String insert(Cart cart){
        System.out.println(cart);
        goodsService.insert(cart);

        return "redirect:/findAll";
    }



    @GetMapping("delete")
    public String delete(@RequestParam("id") Integer id){
        goodsService.delete(id);

        return "redirect:/findAll";
    }

    @GetMapping("update")
    public String update(Cart cart){
        goodsService.update(cart);

        return "redirect:/findAll";
    }

    @GetMapping("findAll")
    public String findAll(ModelMap modelMap){
        List<Cart> carts =goodsService.selectAll();
        modelMap.addAttribute("carts",carts);
        return "Settle";
    }


}
