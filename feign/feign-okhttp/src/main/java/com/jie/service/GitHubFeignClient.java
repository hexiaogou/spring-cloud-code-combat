package com.jie.service;

import com.jie.config.FeignOkHttpConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @classname GitHubFeignClient
 * @description gitHub feign client
 * @date 2022/3/5 17:08
 * @author hexiaogou
 */
@FeignClient(name = "github-client",url = "https://api.github.com",configuration = FeignOkHttpConfig.class)
public interface GitHubFeignClient {
    /**
     * search github repo
     * @param queryStr
     * @return
     */
    @RequestMapping(value = "/search/repositories")
    String searchRepo(@RequestParam(value = "q") String queryStr);
}
