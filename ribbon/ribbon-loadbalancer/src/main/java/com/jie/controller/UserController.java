package com.jie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author hexiaogou
 * @classname UserController
 * @description user controller
 * @date 2022/3/8 16:58
 */
@RestController
public class UserController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/add")
    public String add(Integer a, Integer b) {
        String result = restTemplate.getForObject("http://RIBBON-CLIENT/add?a=" + a + "&b=" + b, String.class);
        System.out.println(result);
        return result;
    }
}
