package com.jie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hexiaogou
 * @classname UserController
 * @description user controller
 * @date 2022/3/8 16:47
 */
@RestController
public class UserController {
    @GetMapping(value = "/add")
    public String add(Integer a, Integer b, HttpServletRequest request) {
        return "From Port:" + request.getServerPort() + ",Result:" + (a + b);
    }
}
