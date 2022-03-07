package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author hexiaogou
 * @classname FeignUploadClientApplication
 * @description feign upload client application
 * @date 2022/3/7 18:29
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignUploadClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignUploadClientApplication.class, args);
    }
}
