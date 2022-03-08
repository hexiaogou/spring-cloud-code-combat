package com.jie.controller;

import com.jie.dto.UserDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hexiaogou
 * @classname UserController
 * @description user controller
 * @date 2022/3/7 15:34
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchUser(UserDTO user) {
        return "hello " + user.getName();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@RequestBody UserDTO user) {
        return "hello " + user.getName();
    }
}
