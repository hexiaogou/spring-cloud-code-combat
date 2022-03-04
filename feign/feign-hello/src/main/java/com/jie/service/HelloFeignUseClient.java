package com.jie.service;

import com.jie.config.HelloFeignServiceConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hexiaogou
 * @classname HelloFeignService
 * @description hello feign service
 * @date 2022/3/3 19:31
 */
@FeignClient(name = "github-client", url = "https://api.github.com", configuration = HelloFeignServiceConfig.class)
@Configuration
public interface HelloFeignUseClient {

    /**search gitHub Repo
     * @param queryStr
     * @return
     */
    @RequestMapping(value = "/search/repositories", method = RequestMethod.GET)
    String searchRepo(@RequestParam("q") String queryStr);

    /**
     * search gitHub Gzip Repo
     * @param queryStr
     * @return
     */
    @RequestMapping(value = "/search/repositories",method = RequestMethod.GET)
    ResponseEntity<byte []> searchGzipRepo(@RequestParam("q") String queryStr);
}
