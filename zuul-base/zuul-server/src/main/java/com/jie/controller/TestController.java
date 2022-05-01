package com.jie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hexiaogou
 * @classname TestController
 * @description test controller
 * @date 2022/5/1 20:19
 */
@RestController
public class TestController {

    @GetMapping("/client_another")
    public String add(Integer a, Integer b) {
        return "Local Forward:" + (a + b);
    }
}
