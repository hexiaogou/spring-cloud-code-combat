package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author hexiaogou
 * @classname HystrixClientServiceApplication
 * @description hystrix client service application
 * @date 2022/3/9 13:40
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class HystrixClientServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixClientServiceApplication.class, args);
    }
}
