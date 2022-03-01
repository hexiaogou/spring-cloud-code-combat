package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author hexiaogou
 * @classname MultiZoneEurekaClientApplication
 * @description multi zone eureka client application
 * @date 2022/3/1 17:16
 */
@SpringBootApplication
@EnableEurekaClient
public class MultiZoneEurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(MultiZoneEurekaClientApplication.class, args);
    }
}
