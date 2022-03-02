package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author hexiaogou
 * @classname RemoteRegionEurekaServerApplication
 * @description remote region eureka server application
 * @date 2022/3/2 09:53
 */
@SpringBootApplication
@EnableEurekaServer
public class RemoteRegionEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RemoteRegionEurekaServerApplication.class, args);
    }
}
