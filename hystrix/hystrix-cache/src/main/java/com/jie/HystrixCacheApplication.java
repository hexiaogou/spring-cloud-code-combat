package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author hexiaogou
 * @classname HystrixCacheApplication
 * @description hystrix cache application
 * @date 2022/3/12 13:56
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class HystrixCacheApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixCacheApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
