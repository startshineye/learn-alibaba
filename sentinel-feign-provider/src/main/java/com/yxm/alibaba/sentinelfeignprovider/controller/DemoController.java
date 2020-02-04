package com.yxm.alibaba.sentinelfeignprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/feign")
    public String feign(){
        return "hello sentinel feign";
    }
}
