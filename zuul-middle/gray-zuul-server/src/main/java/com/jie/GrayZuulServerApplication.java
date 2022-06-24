package com.jie;

import com.jie.filter.GrayFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author hexiaogou
 * @classname GrayZuulServerApplication
 * @description gray zuul server application
 * @date 2022/6/24 15:09
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class GrayZuulServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GrayZuulServerApplication.class, args);
    }

    @Bean
    public GrayFilter grayFilter(){
        return new GrayFilter();
    }
}
