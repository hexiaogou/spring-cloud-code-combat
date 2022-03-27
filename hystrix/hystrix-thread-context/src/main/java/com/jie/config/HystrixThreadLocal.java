package com.jie.config;

/**
 * @author hexiaogou
 * @classname HystrixThreadLocal
 * @description hystrix thread local
 * @date 2022/3/26 17:36
 */
public class HystrixThreadLocal {
    public static ThreadLocal<String> threadLocal = new ThreadLocal<>();
}
