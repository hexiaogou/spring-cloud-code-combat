package com.jie.service;

/**
 * @classname IUserService
 * @description IUserService
 * @date 2022/3/9 14:09
 * @author hexiaogou
 */
public interface IUserService {
    /**
     * get User
     * @param userName
     * @return
     * @throws Exception
     */
    String getUser(String userName) throws Exception;
}
