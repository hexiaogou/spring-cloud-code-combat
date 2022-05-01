package com.jie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hexiaogou
 * @classname TestController
 * @description test controller
 * @date 2022/5/1 19:19
 */
@RestController
public class TestController {
    @GetMapping("/add")
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
