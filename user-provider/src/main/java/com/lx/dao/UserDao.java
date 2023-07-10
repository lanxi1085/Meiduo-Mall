package com.lx.dao;


import com.lx.bean.User;
import com.sun.tools.corba.se.idl.InterfaceGen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lx
 */
@Repository
public interface UserDao extends JpaRepository<User,String> {
    /**
     * 登录
     * @param uaccount
     * @param pass
     * @return
     */
    @Query(value = "select * from d_user where uaccount=?1 and upassword=?2 ",nativeQuery = true)
    User login(String uaccount,String pass);

    /**
     * 注册
     * @param user
     * @return
     */
    @Transactional
    @Modifying
    @Query(value = "insert into d_user values(user.uaccount,user.upassword,user.uname,user.usex)",nativeQuery = true)
    Integer insert(@Param("user") User user);
}
