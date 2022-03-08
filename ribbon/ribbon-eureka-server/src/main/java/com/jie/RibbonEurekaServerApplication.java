package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author hexiaogou
 * @classname RibbonEurekaServerApplication
 * @description ribbon eureka server application
 * @date 2022/3/8 16:02
 */
@SpringBootApplication
@EnableEurekaServer
public class RibbonEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonEurekaServerApplication.class, args);
    }
}
