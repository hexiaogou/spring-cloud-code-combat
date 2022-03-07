package com.jie.controller;

import com.jie.dto.UserDTO;
import com.jie.service.UserFeignService;
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

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchUser(@RequestParam(value = "id") Long id,
                             @RequestParam(value = "name") String name,
                             @RequestParam(value = "age") Integer age) {
        UserDTO user = new UserDTO(id, name, age);
        return userFeignService.searchUser(user);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@RequestBody UserDTO user) {
        return userFeignService.addUser(user);
    }
}
