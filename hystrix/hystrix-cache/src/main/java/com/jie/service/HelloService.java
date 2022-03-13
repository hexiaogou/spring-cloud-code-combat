package com.jie.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheRemove;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


/**
 * @author hexiaogou
 * @classname HelloService
 * @description hello service
 * @date 2022/3/12 12:10
 */
@Component
public class HelloService implements IHelloService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    @CacheResult
    @HystrixCommand
    public String hello(Integer id) {
        String json = restTemplate.getForObject("http://HYSTRIX-PRODUCER/getUser/{1}", String.class, id);
        System.out.println(json);
        return json;
    }

    @Override
    @CacheResult
    @HystrixCommand(commandKey = "getUser")
    public String getUserToCommandKey(Integer id) {
        String json = restTemplate.getForObject("http://HYSTRIX-PRODUCER/getUser/{1}", String.class, id);
        System.out.println(json);
        return json;
    }

    @Override
    @CacheRemove(commandKey = "getUser")
    @HystrixCommand
    public String updateUser(Integer id) {
        System.out.println("delete getUser cache");
        return "update success";
    }
}
