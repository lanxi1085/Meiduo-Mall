package com.lx.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lx.bean.Goods;
import com.lx.bean.RestPage;
import com.lx.service.GoodsService;
import com.lx.vo.R;
import org.apache.ibatis.annotations.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @author lx
 */
@Controller
public class GoodsContro {
    @Qualifier("com.lx.service.GoodsService")
    @Autowired
    GoodsService goodsService;

    @GetMapping(value = {"/"})
    public String selectAll(Integer pageNum, ModelMap modelMap){
        if(pageNum==null){
            pageNum=1;
        }
        R r = goodsService.selectAll(pageNum,4);
        System.out.println(r);
        modelMap.addAttribute("goods",r);
        return "index";
    }

    @GetMapping("selectByName")
    public String selectByName(Integer pageNum,String gname,ModelMap modelMap){
        System.out.println(gname);

        if(pageNum==null){
            pageNum=1;
        }
        if(gname==null){
            gname=null;
        }
        R r = goodsService.selectAllByName(gname,pageNum);
        System.out.println(r);
        modelMap.addAttribute("goods",r);
        return "index";
    }

    @GetMapping("selectById")
    public String selectById(@PathParam("gid") Integer gid,ModelMap modelMap){
        System.out.println(gid);
        Goods good = goodsService.selectById(gid);
        modelMap.addAttribute("detail",good);

        return "detail";
    }


    @GetMapping("goods/cart")
    public String cart(@PathParam("gid") Integer gid,ModelMap modelMap){
        System.out.println(gid);
        Goods good = goodsService.selectById(gid);
        modelMap.addAttribute("detail",good);

        return "detail";
    }

}
