package com.jie.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @classname RibbonConfig
 * @description ribbon config
 * @date 2022/3/8 18:35
 * @author hexiaogou
 */
@Configuration
@AvoidScan
public class RibbonConfig {
    @Autowired
    IClientConfig clientConfig;

    @Bean
    public IRule ribbonRule(IClientConfig clientConfig){
        return new RandomRule();
    }
}
