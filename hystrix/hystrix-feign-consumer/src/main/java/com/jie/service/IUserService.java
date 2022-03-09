package com.jie.service;

import com.jie.service.impl.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @classname IUserService
 * @description feign user service
 * @date 2022/3/9 15:09
 * @author hexiaogou
 */
@FeignClient(name = "hystrix-feign-producer",fallback = UserServiceFallback.class)
public interface IUserService {
    /**
     * get provider user
     * @param userName
     * @return
     */
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    String getUser(@RequestParam(value = "userName") String userName);
}
