package com.jie.service;

import com.jie.vo.Animal;

import java.util.concurrent.Future;

/**
 * @author hexiaogou
 * @classname ICollapsingService
 * @description collapsing service
 * @date 2022/3/15 09:47
 */
public interface ICollapsingService {
    /**
     * collapsing
     *
     * @param id
     * @return
     */
    Future<Animal> collapsing(Integer id);

    /**
     * collapsing sync
     *
     * @param id
     * @return
     */
    Animal collapsingSync(Integer id);

    /**
     * collapsing global
     * @param id
     * @return
     */
    Future<Animal> collapsingGlobal(Integer id);
}
