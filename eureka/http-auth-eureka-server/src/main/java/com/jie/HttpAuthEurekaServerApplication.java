package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author hexiaogou
 * @classname HttpAuthEurekaServerApplication
 * @description http auth eureka server application
 * @date 2022/3/2 13:42
 */
@SpringBootApplication
@EnableEurekaServer
public class HttpAuthEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HttpAuthEurekaServerApplication.class, args);
    }
}
