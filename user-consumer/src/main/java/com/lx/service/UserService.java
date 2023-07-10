package com.lx.service;

import com.lx.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author lx
 */

@FeignClient("user-provider")
public interface UserService {
    /**
     * 远程调用提供者login方法
     * @param user
     * @return
     */
    @PostMapping("/login")
    public User login(@RequestBody User user);

    @PostMapping("/reg")
    public User register(@RequestBody User user);
}
