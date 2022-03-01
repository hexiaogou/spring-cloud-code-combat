package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author hexiaogou
 * @classname MultiZoneEurekaServerApplication
 * @description multi zone eureka server application
 * @date 2022/3/1 16:51
 */
@SpringBootApplication
@EnableEurekaServer
public class MultiZoneEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MultiZoneEurekaServerApplication.class, args);
    }
}
