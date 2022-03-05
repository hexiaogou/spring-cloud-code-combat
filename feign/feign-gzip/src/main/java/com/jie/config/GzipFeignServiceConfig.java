package com.jie.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hexiaogou
 * @classname GzipFeignServiceConfig
 * @description gzip feign service config
 * @date 2022/3/3 19:36
 */
@Configuration
public class GzipFeignServiceConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
