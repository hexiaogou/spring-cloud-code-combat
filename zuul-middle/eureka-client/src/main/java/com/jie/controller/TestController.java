package com.jie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hexiaogou
 * @classname TestController
 * @description test controller
 * @date 2022/5/3 14:51
 */
@RestController
public class TestController {

    @GetMapping("/add")
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    @GetMapping("/a/add")
    public Integer aAdd(Integer a, Integer b) {
        return a + b;
    }

    @GetMapping("/sub")
    public Integer sub(Integer a, Integer b){
        return a - b;
    }

    @GetMapping("/mul")
    public String mul(Integer a, Integer b){
        System.out.println("Enter eureka client!");
        return "eureka-client-有毒-" + a * b;
    }

    @GetMapping("/div")
    public Integer div(Integer a, Integer b){
        return a / b;
    }
}
