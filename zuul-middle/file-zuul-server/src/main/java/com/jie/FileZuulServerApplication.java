package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * @author hexiaogou
 * @classname FileZuulServerApplication
 * @description file zuul server application
 * @date 2022/6/24 17:31
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class FileZuulServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FileZuulServerApplication.class, args);
    }
}
