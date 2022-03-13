package com.jie.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.Controller;

import javax.annotation.Resource;

/**
 * @author hexiaogou
 * @classname CacheConfiguration
 * @description cache configuration
 * @date 2022/3/12 11:49
 */
@Configuration
public class CacheConfiguration {

    @Bean
    @ConditionalOnClass(Controller.class)
    public CacheContextInterceptor useContextInterceptor() {
        return new CacheContextInterceptor();
    }

    @Configuration
    @ConditionalOnClass(Controller.class)
    public class WebMvcConfig extends WebMvcConfigurerAdapter{
        @Resource
        CacheContextInterceptor useContextInterceptor;

        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(useContextInterceptor);
        }
    }
}
