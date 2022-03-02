package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author hexiaogou
 * @classname HttpsAuthEurekaClientApplication
 * @description https auth eureka client application
 * @date 2022/3/2 17:44
 */
@SpringBootApplication
@EnableEurekaClient
public class HttpsAuthEurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(HttpsAuthEurekaClientApplication.class, args);
    }
}
