package com.yxm.alibaba.sentinelgatewayservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    /**
     * 因为在gateway中路由规则,都是test的会被拦截
     * @return
     */
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
