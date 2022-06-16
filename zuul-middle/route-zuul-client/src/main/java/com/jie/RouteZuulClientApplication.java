package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hexiaogou
 * @classname RouteZuulClientApplication
 * @description route zuul client application
 * @date 2022/6/16 18:45
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RouteZuulClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(RouteZuulClientApplication.class, args);
    }
}
