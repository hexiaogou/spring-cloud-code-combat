package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @author hexiaogou
 * @classname AuthorityZuulClientApplication
 * @description authority zuul client application
 * @date 2022/6/14 16:43
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableResourceServer
@RestController
public class AuthorityZuulClientApplication extends ResourceServerConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(AuthorityZuulClientApplication.class, args);
    }

    @RequestMapping("/test")
    public String test(HttpServletRequest request) {
        System.out.println("------------x-------header-------------------");
        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            System.out.println(key + ": " + request.getHeader(key));
        }
        System.out.println("-------------------header-------------------");
        return "hello ooo ooo ooo ooo!";
    }

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.resourceId("WRIGTH")
                .tokenStore(jwtTokenStore());
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/**").authenticated()
                .antMatchers(HttpMethod.GET, "/test")
                .hasAuthority("WRIGTH_READ");
    }

    @Bean
    public TokenStore jwtTokenStore() {
        return new JwtTokenStore(jwtTokenConverter());
    }

    @Bean
    public JwtAccessTokenConverter jwtTokenConverter() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        converter.setSigningKey("spring_cloud123");
        return converter;
    }
}
