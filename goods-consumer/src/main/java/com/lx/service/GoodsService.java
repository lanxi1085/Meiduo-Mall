package com.lx.service;

import com.lx.bean.Cart;
import com.lx.bean.Goods;
import com.lx.bean.RestPage;
import com.lx.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author lx
 */
@Service
@FeignClient("goods-provider")
public interface GoodsService {

    /**
     * 远程调用提供者方法
     * @return
     */
    @GetMapping(value = "/selectAll")
    R selectAll(@RequestParam("page") Integer page, @RequestParam("pagesize")Integer pagesize);

    /**
     *
     * @param name
     * @return
     */
    @GetMapping("/selectAllByName")
    R selectAllByName(@RequestParam("name") String name,@RequestParam("page") Integer page);

    /**
     *
     * @param id
     * @return
     */
    @GetMapping("/findById")
    Goods  selectById(@RequestParam("id") Integer id);


    @PostMapping("/saveCart")
    Cart insert(@RequestBody Cart cart);

    @GetMapping("/deleteCart")
    void delete(@RequestParam("id") Integer id);

    @GetMapping("/selectAllCart")
    List<Cart> selectAll();

    @PostMapping ("/updateCart")
    Cart update(Cart cart);

}
