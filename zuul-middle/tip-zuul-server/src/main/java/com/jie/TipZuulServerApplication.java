package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author hexiaogou
 * @classname TipZuulServerApplication
 * @description tip zuul server application
 * @date 2022/6/28 15:22
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class TipZuulServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TipZuulServerApplication.class, args);
    }
}
