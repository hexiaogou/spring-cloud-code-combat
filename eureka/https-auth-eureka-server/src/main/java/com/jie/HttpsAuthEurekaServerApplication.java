package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author hexiaogou
 * @classname HttpsAuthEurekaServerApplication
 * @description https auth eureka server application
 * @date 2022/3/2 17:48
 */
@SpringBootApplication
@EnableEurekaServer
public class HttpsAuthEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HttpsAuthEurekaServerApplication.class, args);
    }
}
