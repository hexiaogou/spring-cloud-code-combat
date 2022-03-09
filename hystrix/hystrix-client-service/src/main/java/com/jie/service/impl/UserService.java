package com.jie.service.impl;

import com.jie.service.IUserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

/**
 * @author hexiaogou
 * @classname UserService
 * @description user service implementation
 * @date 2022/3/9 14:10
 */
@Component
public class UserService implements IUserService {
    private static final String SPRING_USER_NAME = "spring";

    @Override
    @HystrixCommand(fallbackMethod = "defaultUser")
    public String getUser(String userName) throws Exception {
        if (SPRING_USER_NAME.equals(userName)) {
            return "This is a real user";
        } else {
            throw new Exception();
        }
    }

    /**
     * for hystrix return error or delay info
     *
     * @param userName
     * @return
     */
    public String defaultUser(String userName) {
        return "The user:" + userName + " doesn't exist in this system";
    }
}
