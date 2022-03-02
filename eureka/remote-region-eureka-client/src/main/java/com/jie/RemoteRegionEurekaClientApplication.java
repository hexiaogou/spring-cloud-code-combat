package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author hexiaogou
 * @classname RemoteRegionEurekaClientApplication
 * @description remote region eureka client application
 * @date 2022/3/2 10:36
 */
@SpringBootApplication
@EnableEurekaClient
public class RemoteRegionEurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(RemoteRegionEurekaClientApplication.class, args);
    }
}
