package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author hexiaogou
 * @classname RemoteRegionZuulGatewayApplication
 * @description remote region zuul gateway application
 * @date 2022/3/2 10:44
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class RemoteRegionZuulGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(RemoteRegionZuulGatewayApplication.class, args);
    }
}
