package com.jie.controller;

import com.jie.service.FeignGzipClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hexiaogou
 * @classname FeignGzipController
 * @description feign gzip controller
 * @date 2022/3/5 15:31
 */
@RestController
public class FeignGzipController {
    @Autowired
    FeignGzipClient feignGzipClient;

    @GetMapping(value = "/search/github")
    ResponseEntity<byte[]> searchGithubRepo(@RequestParam("str") String queryStr) {
        return feignGzipClient.searchRepo(queryStr);
    }
}
