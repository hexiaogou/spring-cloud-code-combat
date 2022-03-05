package com.jie;

import com.jie.service.FeignGzipClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author hexiaogou
 * @classname FeignGzipApplication
 * @description feign gzip application
 * @date 2022/3/5 15:22
 */
@SpringBootApplication
@EnableFeignClients(clients = FeignGzipClient.class)
public class FeignGzipApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignGzipApplication.class, args);
    }
}
