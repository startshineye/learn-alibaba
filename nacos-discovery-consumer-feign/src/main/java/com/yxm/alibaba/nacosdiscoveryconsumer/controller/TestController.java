package com.yxm.alibaba.nacosdiscoveryconsumer.controller;
import com.yxm.alibaba.nacosdiscoveryconsumer.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
    @Autowired
    private HelloFeignService helloFeignService;

    @GetMapping("/test")
    public String test(String name){
        return helloFeignService.hello(name);
    }
}
