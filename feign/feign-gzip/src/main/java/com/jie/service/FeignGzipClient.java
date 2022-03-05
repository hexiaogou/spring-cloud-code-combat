package com.jie.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hexiaogou
 * @classname FeignGzipClient
 * @description feign gzip client
 * @date 2022/3/5 15:24
 */
@FeignClient(name = "github-client", url = "https://api.github.com")
public interface FeignGzipClient {
    /**
     * search github repositories by gzip
     *
     * @param queryStr
     * @return
     */
    @RequestMapping(value = "/search/repositories", method = RequestMethod.GET)
    ResponseEntity<byte[]> searchRepo(@RequestParam("q") String queryStr);
}
