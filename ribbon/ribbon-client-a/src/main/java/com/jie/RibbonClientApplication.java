package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @classname RibbonClientApplication
 * @description ribbon client a application
 * @date 2022/3/8 16:46
 * @author hexiaogou
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonClientApplication.class,args);
    }
}
