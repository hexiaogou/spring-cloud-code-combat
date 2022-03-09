package com.jie.service.impl;

import com.jie.service.IUserService;
import org.springframework.stereotype.Component;

/**
 * @author hexiaogou
 * @classname UserServiceFallback
 * @description feign user service fallback
 * @date 2022/3/9 15:12
 */
@Component
public class UserServiceFallback implements IUserService{
    @Override
    public String getUser(String userName) {
        return "The user:" + userName + " doesn't exist in this system";
    }
}
