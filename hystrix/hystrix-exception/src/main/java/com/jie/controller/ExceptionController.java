package com.jie.controller;

import com.jie.dataservice.FallbackBadRequestException;
import com.jie.dataservice.FallbackOtherException;
import com.jie.dataservice.ProviderServiceCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hexiaogou
 * @classname ExceptionController
 * @description exception controller
 * @date 2022/3/11 15:13
 */
@RestController
public class ExceptionController {
    Logger log = LoggerFactory.getLogger(ExceptionController.class);

    @GetMapping(value = "/getProviderServiceCommand")
    public String getProviderServiceCommand() {
        String result = new ProviderServiceCommand("World").execute();
        return result;
    }

    @GetMapping(value = "/getFallbackBadRequestException")
    public String getFallbackBadRequestException() {
        String result = new FallbackBadRequestException().execute();
        return result;
    }


    @GetMapping(value = "/getFallbackOtherException")
    public String getFallbackOtherException() {
        String result = new FallbackOtherException().execute();
        return result;
    }

    @GetMapping(value = "/getFallbackMethodTest")
    @HystrixCommand
    public String getFallbackMethodTest(String id) {
        throw new RuntimeException("getFallbackMethodTest failed");
    }

    public String fallback(String id, Throwable throwable) {
        log.error(throwable.getMessage());
        return "this is fallback message";
    }
}
