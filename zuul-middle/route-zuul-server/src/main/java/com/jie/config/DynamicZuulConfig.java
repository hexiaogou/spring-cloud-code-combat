package com.jie.config;

import com.jie.DynamicZuulRouteLocator;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author hexiaogou
 * @classname DynamicZuulConfig
 * @description dynamic zuul config
 * @date 2022/6/16 18:40
 */
@Configuration
public class DynamicZuulConfig {

    @Resource
    private ZuulProperties zuulProperties;

    @Resource
    private ServerProperties serverProperties;

    @Bean
    public DynamicZuulRouteLocator routeLocator() {
        DynamicZuulRouteLocator routeLocator = new DynamicZuulRouteLocator(serverProperties.getServlet().getServletPrefix(),
                zuulProperties);
        return routeLocator;
    }
}
