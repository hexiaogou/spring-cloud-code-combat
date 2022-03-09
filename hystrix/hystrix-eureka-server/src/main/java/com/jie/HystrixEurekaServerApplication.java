package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author hexiaogou
 * @classname HystrixEurekaServerApplication
 * @description hystrix eureka server application
 * @date 2022/3/9 14:21
 */
@SpringBootApplication
@EnableEurekaServer
public class HystrixEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixEurekaServerApplication.class, args);
    }
}
