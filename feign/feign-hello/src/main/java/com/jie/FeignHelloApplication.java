package com.jie;

import com.jie.service.HelloFeignUseClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author hexiaogou
 * @classname FeignHelloApplication
 * @description feign hello application
 * @date 2022/3/3 19:29
 */
@SpringBootApplication
@EnableFeignClients(clients = HelloFeignUseClient.class)
public class FeignHelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignHelloApplication.class, args);
    }
}
