package com.jie.controller;

import com.jie.service.GitHubFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hexiaogou
 * @classname FeignHttpClientController
 * @description controller
 * @date 2022/3/5 17:15
 */
@RestController
public class FeignHttpClientController {
    @Autowired
    GitHubFeignClient gitHubFeignClient;

    @GetMapping(value = "/search/github")
    public String searchRepo(@RequestParam("str") String queryStr) {
        return gitHubFeignClient.searchRepo(queryStr);
    }
}
