package com.jie.controller;

import com.jie.service.ICollapsingService;
import com.jie.vo.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

/**
 * @author hexiaogou
 * @classname CollapsingController
 * @description collapsing controller
 * @date 2022/3/15 10:31
 */
@RestController
public class CollapsingController {
    @Autowired
    ICollapsingService collapsingService;

    @RequestMapping(value = "/getAnimal")
    public String getAnimal() throws Exception {
        Future<Animal> user = collapsingService.collapsing(1);
        Future<Animal> user_one = collapsingService.collapsing(2);
        System.out.println(user.get().getName());
        System.out.println(user_one.get().getName());
        return "Success";
    }

    @RequestMapping(value = "/getAnimalGlobal")
    public String getAnimalGlobal() throws Exception {
        Future<Animal> user = collapsingService.collapsingGlobal(1);
        Future<Animal> user_one = collapsingService.collapsingGlobal(2);
        System.out.println(user.get().getName());
        System.out.println(user_one.get().getName());
        return "Success";
    }

    @RequestMapping(value = "/getAnimalSync")
    public String getAnimalSync() throws Exception {
        Animal user = collapsingService.collapsingSync(1);
        Animal user_one = collapsingService.collapsingSync(2);
        System.out.println(user.getName());
        System.out.println(user_one.getName());
        return "Success";
    }
}
