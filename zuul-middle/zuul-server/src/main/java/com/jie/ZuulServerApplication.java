package com.jie;

import com.jie.filter.*;
import com.netflix.zuul.FilterFileManager;
import com.netflix.zuul.FilterLoader;
import com.netflix.zuul.groovy.GroovyCompiler;
import com.netflix.zuul.groovy.GroovyFileFilter;
import com.netflix.zuul.monitoring.MonitoringHelper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


/**
 * @author hexiaogou
 * @classname ZuulServerApplication
 * @description zuul server application
 * @date 2022/5/2 17:38
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ZuulServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class, args);
    }

    @Component
    public static class GroovyRunner implements CommandLineRunner{
        @Override
        public void run(String... args) throws Exception {
            MonitoringHelper.initMocks();
            FilterLoader.getInstance().setCompiler(new GroovyCompiler());

            try {
                FilterFileManager.setFilenameFilter(new GroovyFileFilter());
                String directorPath ="/Users/hexiaogou/Git_House_For_Mine/spring-cloud-code-combat/zuul-middle/zuul-server/src/main/java/com/jie/groovy";
                FilterFileManager.init(20,directorPath);
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
    }
    @Bean
    public FirstPreFilter firstPreFilter() {
        return new FirstPreFilter();
    }

    @Bean
    public SecondPreFilter secondPreFilter() {
        return new SecondPreFilter();
    }

    @Bean
    public ThirdPreFilter thirdPreFilter() {
        return new ThirdPreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
}
