package com.jie.dataservice;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.exception.HystrixBadRequestException;
import org.springframework.stereotype.Component;

/**
 * @author hexiaogou
 * @classname FallbackBadRequestException
 * @description fall back bad request exception
 * @date 2022/3/11 14:38
 */
@Component
public class FallbackBadRequestException extends HystrixCommand<String> {
    public FallbackBadRequestException() {
        super(HystrixCommandGroupKey.Factory.asKey("GroupBRE"));
    }

    @Override
    protected String run() throws Exception {
        throw new HystrixBadRequestException("HystrixBadRequestException error");
    }

    @Override
    protected String getFallback() {
        System.out.println(getFailedExecutionException().getMessage());
        return "invoke HystrixBadRequestException fallback method";
    }
}
