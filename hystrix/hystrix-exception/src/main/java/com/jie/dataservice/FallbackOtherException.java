package com.jie.dataservice;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.stereotype.Component;

/**
 * @classname FallbackOtherException
 * @description fall back other exception
 * @date 2022/3/11 14:47
 * @author hexiaogou
 */
@Component
public class FallbackOtherException extends HystrixCommand<String> {
    public FallbackOtherException() {
        super(HystrixCommandGroupKey.Factory.asKey("GroupOE"));
    }

    @Override
    protected String getFallback() {
        return "invoke PSFallbackOtherExpcetion fallback method";
    }

    @Override
    protected String run() throws Exception {
        throw new Exception("this command will trigger fallback");
    }
}
