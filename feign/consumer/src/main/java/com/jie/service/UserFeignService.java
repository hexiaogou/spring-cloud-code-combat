package com.jie.service;

import com.jie.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author hexiaogou
 * @classname UserFeignService
 * @description user feign service
 * @date 2022/3/7 16:00
 */
@FeignClient(value = "provider")
public interface UserFeignService {
    /**
     * search user
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/user/search", method = RequestMethod.GET)
    String searchUser(UserDTO user);

    /**
     * add user
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    String addUser(UserDTO user);
}
