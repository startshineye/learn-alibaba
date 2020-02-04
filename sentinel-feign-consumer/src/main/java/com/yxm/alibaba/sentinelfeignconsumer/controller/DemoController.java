package com.yxm.alibaba.sentinelfeignconsumer.controller;
import com.yxm.alibaba.sentinelfeignconsumer.feign.DemoFeginClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoFeginClient demoFeginClient;

    @GetMapping("/hello")
    public String feign(){
        return demoFeginClient.feign();
    }
}
