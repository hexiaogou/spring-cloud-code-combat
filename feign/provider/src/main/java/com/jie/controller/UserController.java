package com.jie.controller;

import com.jie.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hexiaogou
 * @classname UserController
 * @description user controller
 * @date 2022/3/7 15:34
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchUser(UserDTO user) {
        return "hello " + user.getName();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@RequestBody UserDTO user) {
        return "hello " + user.getName();
    }

    @RequestMapping(value = "/oauthTokenSearch", method = RequestMethod.GET)
    public String oauthTokenSearch(UserDTO user, HttpServletRequest request) {
        String oauthToken = request.getHeader("oauth_token");
        return "hello " + user.getName() + " with oauth_token:" + oauthToken;
    }
}
