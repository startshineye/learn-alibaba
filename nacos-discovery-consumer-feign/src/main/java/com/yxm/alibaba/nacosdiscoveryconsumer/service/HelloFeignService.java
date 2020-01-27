package com.yxm.alibaba.nacosdiscoveryconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//FeignClient注解里面填写的是provider服务名称
@FeignClient("nacos-discovery-provider")
public interface HelloFeignService {
    @GetMapping("/hello")
    String hello(@RequestParam("name") String name);
}
