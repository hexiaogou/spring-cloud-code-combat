package com.jie.controller;

import com.jie.dto.UserDTO;
import com.jie.service.UserFeignService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author hexiaogou
 * @classname UserController
 * @description user controller
 * @date 2022/3/7 15:34
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserFeignService userFeignService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String searchUser(@RequestBody @ApiParam(name = "用户", value = "传入json格式", required = true) UserDTO user) {
        return userFeignService.searchUser(user);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@RequestBody @ApiParam(name = "用户", value = "传入json格式", required = true) UserDTO user) {
        return userFeignService.addUser(user);
    }
}
