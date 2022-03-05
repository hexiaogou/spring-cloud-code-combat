package com.jie;

import com.jie.service.GitHubFeignClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author hexiaogou
 * @classname FeignOkHttpApplication
 * @description feign okhttp application
 * @date 2022/3/5 17:39
 */
@SpringBootApplication
@EnableFeignClients(clients = GitHubFeignClient.class)
public class FeignOkHttpApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignOkHttpApplication.class, args);
    }
}
