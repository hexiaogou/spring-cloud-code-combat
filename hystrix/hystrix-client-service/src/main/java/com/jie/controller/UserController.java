package com.jie.controller;

import com.jie.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname UserController
 * @description user controller
 * @date 2022/3/9 14:24
 * @author hexiaogou
 */
@RestController
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping(value = "/getUser")
    public String getUser(@RequestParam(value = "userName") String userName) throws Exception{
        return userService.getUser(userName);
    }
}
