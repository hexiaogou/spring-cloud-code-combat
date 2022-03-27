package com.jie.config;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import java.util.concurrent.Callable;

/**
 * @author hexiaogou
 * @classname HystrixThreadCallable
 * @description hystrix thread callable
 * @date 2022/3/21 11:49
 */
public class HystrixThreadCallable<S> implements Callable<S> {
    private final RequestAttributes requestAttributes;
    private final Callable<S> delegate;
    private String params;

    public HystrixThreadCallable(RequestAttributes requestAttributes, Callable<S> callable, String params) {
        this.requestAttributes = requestAttributes;
        this.delegate = callable;
        this.params = params;
    }

    @Override
    public S call() throws Exception {
        try {
            RequestContextHolder.setRequestAttributes(requestAttributes);
            HystrixThreadLocal.threadLocal.set(params);
            return delegate.call();
        } finally {
            RequestContextHolder.resetRequestAttributes();
            HystrixThreadLocal.threadLocal.remove();
        }
    }
}
