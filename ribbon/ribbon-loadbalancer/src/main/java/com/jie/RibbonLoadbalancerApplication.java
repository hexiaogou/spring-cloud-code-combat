package com.jie;

import com.jie.config.AvoidScan;
import com.jie.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

/**
 * @author hexiaogou
 * @classname RibbonLoadbalancerApplication
 * @description ribbon load balance application
 * @date 2022/3/8 16:55
 */
@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "ribbon-client-a",configuration = RibbonConfig.class)
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {AvoidScan.class})})
public class RibbonLoadbalancerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonLoadbalancerApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
