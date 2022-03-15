package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author hexiaogou
 * @classname HystrixCollapseApplication
 * @description hystrix collapse application
 * @date 2022/3/14 13:40
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class HystrixCollapseApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixCollapseApplication.class, args);
    }
}
