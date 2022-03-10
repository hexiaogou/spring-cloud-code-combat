package com.jie;

import com.jie.service.dataservice.ProviderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author hexiaogou
 * @classname HystrixHelloApplication
 * @description hystrix hello application
 * @date 2022/3/9 19:10
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients(basePackageClasses = {ProviderService.class})
public class HystrixHelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixHelloApplication.class, args);
    }
}
