package com.jie;

import com.jie.service.IUserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author hexiaogou
 * @classname HystrixFeignConsumerApplication
 * @description hystrix feign consumer application
 * @date 2022/3/9 15:06
 */
@SpringBootApplication
@EnableFeignClients(basePackageClasses = {IUserService.class})
public class HystrixFeignConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixFeignConsumerApplication.class, args);
    }
}
