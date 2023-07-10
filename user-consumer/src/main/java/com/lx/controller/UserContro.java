package com.lx.controller;

import com.lx.bean.User;
import com.lx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author lx
 */
@Controller
public class UserContro {


    @Qualifier("com.lx.service.UserService")
    @Autowired
    UserService userService;

    @RequestMapping(value = {"/toLogin"})
    public String index(){
        return "login";
    }

    @GetMapping("/toregister")
    public String toreg(){
        return "register";
    }

    @PostMapping("login")
    public String login(User user, HttpServletRequest request){
        System.out.println(user);
        User login = userService.login(user);
        System.out.println(login);

        return "register";
    }

    @PostMapping("register")
    public String register(User user,HttpServletRequest request){
        System.out.println("++++++++++"+user);
        User register = userService.register(user);

        return "register";
    }


}
