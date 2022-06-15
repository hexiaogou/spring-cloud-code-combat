package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author hexiaogou
 * @classname LimitZuulServerApplication
 * @description limit zuul server application
 * @date 2022/6/15 14:07
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class LimitZuulServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(LimitZuulServerApplication.class, args);
    }
}
