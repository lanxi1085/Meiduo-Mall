package com.lx;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lx.bean.Goods;
import com.lx.dao.GoodsDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GoodsProviderApplicationTests {
	@Autowired
	GoodsDao goodsDao;
//	@Test
//	void contextLoads() {
//		Page<Goods> page=new Page<>(1,3);
//		QueryWrapper<Goods> goodsQueryWrapper=new QueryWrapper<>();
//		Page<Goods> page1 = goodsDao.selectPage(page, goodsQueryWrapper);
//		System.out.println(page1);
//
//	}

}
