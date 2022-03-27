package com.jie.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hexiaogou
 * @classname HystrixThreadContextConfig
 * @description hystrix thread context config
 * @date 2022/3/26 17:38
 */
@Configuration
public class HystrixThreadContextConfig {
    @Bean
    public SpringCloudHystrixConcurrencyStrategy springCloudHystrixConcurrencyStrategy() {
        return new SpringCloudHystrixConcurrencyStrategy();
    }
}
