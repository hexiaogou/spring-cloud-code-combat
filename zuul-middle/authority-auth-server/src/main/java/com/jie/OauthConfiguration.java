package com.jie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

import javax.annotation.Resource;

/**
 * @author hexiaogou
 * @classname OauthConfiguration
 * @description oauth configuration
 * @date 2022/6/14 16:26
 */
@Configuration
@EnableAuthorizationServer
public class OauthConfiguration extends AuthorizationServerConfigurerAdapter {
    @Resource
    private AuthenticationManager authenticationManager;

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("authority-zuul-server")
                .secret("secret")
                .scopes("WRIGTH", "read").autoApprove(true)
                .authorities("WRIGTH_WRITE", "WRIGTH_READ")
                .authorizedGrantTypes("implicit", "refresh_token", "password", "authorization_code");
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.tokenStore(jwtTokenStore())
                .tokenEnhancer(jwtTokenConverter())
                .authenticationManager(authenticationManager);
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
