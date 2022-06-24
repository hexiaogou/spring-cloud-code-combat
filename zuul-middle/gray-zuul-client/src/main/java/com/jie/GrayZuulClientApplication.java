package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hexiaogou
 * @classname GrayZuulClientApplication
 * @description gray zuul client application
 * @date 2022/6/24 15:44
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GrayZuulClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(GrayZuulClientApplication.class, "--spring.profiles.active=node3");
    }
}
