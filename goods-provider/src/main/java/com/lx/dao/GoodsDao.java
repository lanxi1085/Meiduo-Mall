package com.lx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lx.bean.Goods;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lx
 */
@Repository
public interface GoodsDao extends JpaRepository<Goods,Integer> {

}
