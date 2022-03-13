package com.jie.controller;

import com.jie.service.HelloCommand;
import com.jie.service.IHelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author hexiaogou
 * @classname CacheController
 * @description cache controller
 * @date 2022/3/12 12:30
 */
@RestController
public class CacheController {
    private static final Logger log = LoggerFactory.getLogger(CacheController.class);

    @Autowired
    IHelloService helloService;
    @Autowired
    RestTemplate restTemplate;

    /**
     * cache
     * @param id
     * @return
     */
    @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
    public String getUser(@PathVariable(value = "id") Integer id) {
        helloService.hello(id);
        helloService.hello(id);
        return "get user success";
    }

    /**
     * cache update
     * @param id
     * @return
     */
    @RequestMapping(value = "/getUserIdUpdate/{id}", method = RequestMethod.GET)
    public String getUserIdUpdate(@PathVariable(value = "id") Integer id){
        helloService.hello(id);
        helloService.hello(id);
        helloService.hello(5);
        return "getUserIdUpdate success";
    }

    /**
     * Inherit class type
     * @param id
     * @return
     */
    @RequestMapping(value = "/getUserIdByExtendCommand/{id}", method = RequestMethod.GET)
    public String getUserIdByExtendCommand(@PathVariable(value = "id") Integer id){
        HelloCommand one = new HelloCommand(restTemplate,id);
        one.execute();
        log.info("from cache:{}",one.isResponseFromCache());
        HelloCommand two = new HelloCommand(restTemplate,id);
        two.execute();
        log.info("from cache:{}",two.isResponseFromCache());
        return "getUserIdByExtendCommand success";
    }

    /**
     * cache and cache remove
     * @param id
     * @return
     */
    @RequestMapping(value = "/getAndUpdateUser/{id}", method = RequestMethod.GET)
    public String getAndUpdateUser(@PathVariable(value = "id") Integer id){
        helloService.getUserToCommandKey(id);
        helloService.getUserToCommandKey(id);

        helloService.updateUser(id);

        helloService.getUserToCommandKey(id);
        helloService.getUserToCommandKey(id);
        return "getAndUpdateUser success";
    }
}
