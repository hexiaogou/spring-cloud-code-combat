package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author hexiaogou
 * @classname RouteZuulServerApplication
 * @description route zuul server application
 * @date 2022/6/16 18:09
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class RouteZuulServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RouteZuulServerApplication.class, args);
    }
}
