package com.jie.service;

import com.jie.vo.Animal;
import com.netflix.hystrix.HystrixCollapser.Scope;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/**
 * @author hexiaogou
 * @classname CollapsingService
 * @description collapsing service
 * @date 2022/3/15 09:51
 */
@Component
public class CollapsingService implements ICollapsingService {
    @Override
    @HystrixCollapser(batchMethod = "collapsingList", collapserProperties = {
            @HystrixProperty(name = "timerDelayInMilliseconds", value = "1000")
    })
    public Future<Animal> collapsing(Integer id) {
        return null;
    }


    @Override
    @HystrixCollapser(batchMethod = "collapsingList", collapserProperties = {
            @HystrixProperty(name = "timerDelayInMilliseconds", value = "1000")
    })
    public Animal collapsingSync(Integer id) {
        return null;
    }


    @Override
    @HystrixCollapser(batchMethod = "collapsingListGlobal", scope = Scope.GLOBAL, collapserProperties = {
            @HystrixProperty(name = "timerDelayInMilliseconds", value = "10000")
    })
    public Future<Animal> collapsingGlobal(Integer id) {
        return null;
    }


    @HystrixCommand
    public List<Animal> collapsingList(List<Integer> animalParam) {
        System.out.println("collapsingList current thread:" + Thread.currentThread().getName());
        System.out.println("collapsingList current request param size:" + animalParam.size());
        List<Animal> animals = new ArrayList<>();
        for (Integer animalNumber : animalParam) {
            Animal animal = new Animal("Cat - " + animalNumber, "male", animalNumber);
            animals.add(animal);
        }
        return animals;
    }

    @HystrixCommand
    public List<Animal> collapsingListGlobal(List<Integer> animalParam) {
        System.out.println("collapsingList current thread:" + Thread.currentThread().getName());
        System.out.println("collapsingList current request param size:" + animalParam.size());
        List<Animal> animals = new ArrayList<>();
        for (Integer animalNumber : animalParam) {
            Animal animal = new Animal("Cat - " + animalNumber, "male", animalNumber);
            animals.add(animal);
        }
        return animals;
    }
}
