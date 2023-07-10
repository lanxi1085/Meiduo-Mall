package com.lx.dao;

import com.lx.bean.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lx
 */
@Repository
public interface CardDao extends JpaRepository<Cart,Integer> {
}
