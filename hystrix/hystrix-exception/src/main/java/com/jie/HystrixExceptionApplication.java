package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author hexiaogou
 * @classname HystrixExceptionApplication
 * @description hystrix exception application
 * @date 2022/3/10 18:45
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients(basePackages = {})
public class HystrixExceptionApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixExceptionApplication.class, args);
    }
}
