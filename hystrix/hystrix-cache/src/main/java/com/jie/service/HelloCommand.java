package com.jie.service;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import com.netflix.hystrix.HystrixRequestCache;
import com.netflix.hystrix.strategy.concurrency.HystrixConcurrencyStrategyDefault;
import org.springframework.web.client.RestTemplate;

/**
 * @author hexiaogou
 * @classname HelloCommand
 * @description hello command
 * @date 2022/3/12 12:19
 */
public class HelloCommand extends HystrixCommand<String> {
    private RestTemplate restTemplate;
    private Integer id;

    public HelloCommand(RestTemplate restTemplate, Integer id) {
        super(HystrixCommandGroupKey.Factory.asKey("springCloudCacheGroup"));
        this.restTemplate = restTemplate;
        this.id = id;
    }

    @Override
    protected String getFallback() {
        return "fall back";
    }

    @Override
    protected String getCacheKey() {
        return String.valueOf(id);
    }

    @Override
    protected String run() throws Exception {
        String json = restTemplate.getForObject("http://hystrix-provider/getUser/{1}", String.class, id);
        System.out.println(json);
        return json;
    }

    public static void cacheClean(Integer id) {
        HystrixRequestCache.getInstance(
                (HystrixCommandKey) HystrixCommandGroupKey.Factory.asKey("springCloudCacheGroup"),
                HystrixConcurrencyStrategyDefault.getInstance()
        ).clear(String.valueOf(id));
    }
}
