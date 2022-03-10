package com.jie.controller;

import com.jie.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hexiaogou
 * @classname ProviderController
 * @description provider controller
 * @date 2022/3/9 19:33
 */
@RestController
public class ProviderController {
    @Autowired
    ConsumerService consumerService;

    @GetMapping(value = "getDashBoard")
    public List<String> getProducerData() {
        List<String> producerData = new ArrayList<>();
        producerData.add("hystrix dashboard");
        producerData.add("hystrix dashboard");
        return producerData;
    }

    @GetMapping(value = "helloService")
    public String helloService() {
        return consumerService.helloService();
    }
}
