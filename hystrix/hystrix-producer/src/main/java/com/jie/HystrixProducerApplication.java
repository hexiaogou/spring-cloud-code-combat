package com.jie;

import com.jie.service.ConsumerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author hexiaogou
 * @classname HystrixProducerApplication
 * @description hystrix producer application
 * @date 2022/3/9 19:28
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients(basePackageClasses = {ConsumerService.class})
public class HystrixProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixProducerApplication.class, args);
    }
}
