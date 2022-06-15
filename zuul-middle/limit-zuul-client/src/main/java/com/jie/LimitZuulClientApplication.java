package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hexiaogou
 * @classname LimitZuulClientApplication
 * @description limit zuul client application
 * @date 2022/6/15 14:10
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LimitZuulClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(LimitZuulClientApplication.class, args);
    }
}
