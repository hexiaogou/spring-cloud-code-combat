package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hexiaogou
 * @classname ProviderApplication
 * @description provider application
 * @date 2022/3/7 15:30
 */
@SpringBootApplication
@EnableDiscoveryClient
public class VenusFeignProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(VenusFeignProviderApplication.class, args);
    }
}
