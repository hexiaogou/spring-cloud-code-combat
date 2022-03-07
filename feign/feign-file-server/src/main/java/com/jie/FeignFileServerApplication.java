package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @classname FeignFileServerApplication
 * @description feign file server application
 * @date 2022/3/7 19:10
 * @author hexiaogou
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FeignFileServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignFileServerApplication.class, args);
    }
}
