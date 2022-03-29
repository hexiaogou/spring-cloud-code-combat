package com.jie.controller;

import com.jie.config.HystrixThreadLocal;
import com.jie.service.IThreadContextService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * @author hexiaogou
 * @classname ThreadContextController
 * @description thread context controller
 * @date 2022/3/29 10:09
 */
@RestController
public class ThreadContextController {
    private static final Logger log = LoggerFactory.getLogger(ThreadContextController.class);

    @Autowired
    IThreadContextService threadContextService;

    /**
     * get user
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
    public String getUser(@PathVariable(value = "id") Integer id) {
        HystrixThreadLocal.threadLocal.set("userId:" + id);

        RequestContextHolder.currentRequestAttributes().setAttribute("userId", "userId:" + id, RequestAttributes.SCOPE_REQUEST);
        log.info("Current Thread:" + Thread.currentThread().getId());
        log.info("Thread Local:" + HystrixThreadLocal.threadLocal.get());
        log.info("RequestContextHolder:"+RequestContextHolder.currentRequestAttributes().getAttribute("userId",RequestAttributes.SCOPE_REQUEST));
        return threadContextService.getUser(id);
    }
}
