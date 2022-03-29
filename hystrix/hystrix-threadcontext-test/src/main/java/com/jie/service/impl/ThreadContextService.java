package com.jie.service.impl;

import com.jie.config.HystrixThreadLocal;
import com.jie.service.IThreadContextService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * @author hexiaogou
 * @classname ThreadContextService
 * @description thread context service impl
 * @date 2022/3/29 09:59
 */
@Service
public class ThreadContextService implements IThreadContextService {
    private static final Logger log = LoggerFactory.getLogger(ThreadContextService.class);

    @Autowired
    RestTemplate restTemplate;

    @Override
    @HystrixCommand
    public String getUser(Integer id) {
        log.info("ThreadContextService,Current Thread:" + Thread.currentThread().getId());
        log.info("ThreadContextService,ThreadContext Object:" + HystrixThreadLocal.threadLocal.get());
        log.info("ThreadContextService,RequestContextHolder:" + RequestContextHolder.currentRequestAttributes().getAttribute("userId",
                RequestAttributes.SCOPE_REQUEST).toString());
        String json = restTemplate.getForObject("http://hystrix-producer/getUser/{1}",String.class,id);
        return json;
    }
}
