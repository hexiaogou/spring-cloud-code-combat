package com.jie.service;

import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheKey;

/**
 * @author hexiaogou
 * @classname IHelloService
 * @description interface hello service
 * @date 2022/3/12 12:06
 */

public interface IHelloService {
    /**
     * hello
     *
     * @param id
     * @return
     */
    String hello(Integer id);

    /**
     * get user to command key
     *
     * @param id
     * @return
     */
    String getUserToCommandKey(@CacheKey Integer id);

    /**
     * update user
     *
     * @param id
     * @return
     */
    String updateUser(@CacheKey Integer id);
}
