package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author hexiaogou
 * @classname FeignHttpClientApplication
 * @description feign http client application --use httpclient replacing feign default client
 * @date 2022/3/5 17:05
 */
@SpringBootApplication
@EnableFeignClients
public class FeignHttpClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignHttpClientApplication.class, args);
    }
}
