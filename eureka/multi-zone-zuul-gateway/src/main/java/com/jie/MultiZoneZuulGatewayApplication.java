package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author hexiaogou
 * @classname MultiZoneZuulGatewayApplication
 * @description multi zone zuul gateway application
 * @date 2022/3/1 17:26
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class MultiZoneZuulGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(MultiZoneZuulGatewayApplication.class, args);
    }
}
