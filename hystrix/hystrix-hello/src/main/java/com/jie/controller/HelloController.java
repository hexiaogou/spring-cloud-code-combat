package com.jie.controller;

import com.jie.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hexiaogou
 * @classname HelloController
 * @description hello controller
 * @date 2022/3/9 19:20
 */
@RestController
public class HelloController {
    @Autowired
    IHelloService helloService;

    @GetMapping(value = "/getProducerData")
    public List<String> getProducerData() {
        return helloService.getProducerData();
    }

    @RequestMapping(value = "/helloService", method = RequestMethod.GET)
    public String helloService() {
        return "hello service";
    }
}
