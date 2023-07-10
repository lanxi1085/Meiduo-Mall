package com.lx.controller;

import com.lx.bean.User;
import com.lx.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author lx
 */
@RestController
public class UserController {
    @Autowired
    UserDao userDao;

    @PostMapping("/login")
    public User login(@RequestBody User u, HttpServletRequest request){
        User user = userDao.login(u.getUaccount(), u.getUpassword());
        HttpSession session = request.getSession();
        session.setAttribute("user",user);
        return user;
    }

    @PostMapping("/reg")
    public User register(@RequestBody User u){
        System.out.println("1"+u);
        User save = userDao.save(u);
        if(save!=null){
            System.out.println("注册成功");
            return save;
        }
        return save;
    }

}
