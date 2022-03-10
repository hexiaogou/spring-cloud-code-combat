package com.jie.service.dataservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @classname ProviderService
 * @description use feign client call provider
 * @date 2022/3/9 19:16
 * @author hexiaogou
 */
@FeignClient(name = "hystrix-producer")
public interface ProviderService {
    /**
     * get provider data
     * @return
     */
    @RequestMapping(value = "/getDashBoard",method = RequestMethod.GET)
    List<String> getProducerData();
}
