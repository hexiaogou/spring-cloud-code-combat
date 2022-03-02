package com.jie.config;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.shared.transport.jersey.EurekaJerseyClientImpl;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.net.ssl.SSLContext;

/**
 * @author hexiaogou
 * @classname EurekaHttpsClientConfig
 * @description eureka https client config
 * @date 2022/3/2 18:12
 */
@Configuration
public class EurekaHttpsClientConfig {
    @Value("${eureka.client.ssl.key-store}")
    String keyStoreFileName;

    @Value("${eureka.client.ssl.key-store-password}")
    String keyStorePassword;

    @Bean
    public DiscoveryClient.DiscoveryClientOptionalArgs discoveryClientOptionalArgs() throws Exception {
        EurekaJerseyClientImpl.EurekaJerseyClientBuilder builder = new EurekaJerseyClientImpl.EurekaJerseyClientBuilder();

        builder.withClientName("eureka-https-client");
        SSLContext sslContext = new SSLContextBuilder()
                .loadTrustMaterial(
                this.getClass().getClassLoader().getResource(keyStoreFileName),
                        keyStorePassword.toCharArray())
                .build();
        builder.withCustomSSL(sslContext);
        builder.withMaxTotalConnections(10);
        builder.withMaxConnectionsPerHost(10);

        DiscoveryClient.DiscoveryClientOptionalArgs args = new DiscoveryClient.DiscoveryClientOptionalArgs();
        args.setEurekaJerseyClient(builder.build());
        return args;
    }
}
