package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author hexiaogou
 * @classname VenusFeignConsumerApplication
 * @description venus feign consumer application
 * @date 2022/3/8 14:17
 */
@SpringBootApplication
@EnableFeignClients
public class VenusFeignConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(VenusFeignConsumerApplication.class, args);
    }
}
