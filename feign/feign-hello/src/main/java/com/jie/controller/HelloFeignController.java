package com.jie.controller;

import com.jie.service.HelloFeignUseClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author hexiaogou
 * @classname HelloFeignController
 * @description hello feign controller
 * @date 2022/3/3 19:36
 */
@RestController
public class HelloFeignController {
    @Autowired
    private HelloFeignUseClient feignUseClient;

    @GetMapping(value = "/search/github")
    public String searchGithubRepoStr(@RequestParam("str") String queryStr) {
        return feignUseClient.searchRepo(queryStr);
    }
}
