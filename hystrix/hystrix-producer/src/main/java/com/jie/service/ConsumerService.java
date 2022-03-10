package com.jie.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @classname ConsumerService
 * @description consumer service
 * @date 2022/3/9 19:31
 * @author hexiaogou
 */
@FeignClient(name = "hystrix-hello")
public interface ConsumerService {
    /**
     * feign call hello
     * @return
     */
    @RequestMapping(value = "/helloService",method = RequestMethod.GET)
    String helloService();
}
