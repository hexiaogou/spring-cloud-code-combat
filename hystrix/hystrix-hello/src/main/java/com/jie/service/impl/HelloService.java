package com.jie.service.impl;

import com.jie.service.IHelloService;
import com.jie.service.dataservice.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author hexiaogou
 * @classname HelloService
 * @description hello service
 * @date 2022/3/9 19:15
 */
@Component
public class HelloService implements IHelloService {
    @Autowired
    ProviderService providerService;

    @Override
    public List<String> getProducerData() {
        return providerService.getProducerData();
    }
}
