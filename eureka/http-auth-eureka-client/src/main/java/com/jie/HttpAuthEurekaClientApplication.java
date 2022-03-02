package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hexiaogou
 * @classname HttpAuthEurekaClientApplciation
 * @description http auth eureka client application
 * @date 2022/3/2 13:56
 */
@SpringBootApplication
@EnableDiscoveryClient
public class HttpAuthEurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(HttpAuthEurekaClientApplication.class, args);
    }
}
