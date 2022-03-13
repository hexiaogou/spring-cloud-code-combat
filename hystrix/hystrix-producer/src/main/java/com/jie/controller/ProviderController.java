package com.jie.controller;

import com.jie.service.ConsumerService;
import com.jie.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    @RequestMapping(value = "/getUser/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable(value = "id") Integer id){
        System.out.println("ProviderController id is:"+id);
        if (id == 1) {
            return new User("Toy", "123456", 10);
        } else if (id == 2) {
            return new User("Sky", "000000", 20);
        }
        return new User("San", "543210", 30);
    }
}
