package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hexiaogou
 * @classname HystrixFeignProducerApplication
 * @description hystrix feign producer application
 * @date 2022/3/9 15:30
 */
@SpringBootApplication
@EnableDiscoveryClient
public class HystrixFeignProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixFeignProducerApplication.class, args);
    }
}
