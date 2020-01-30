package com.yxm.alibaba.nacosconfigclientload.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class DemoController {

    @Value("${test:空test}")
    public String str;

    @GetMapping("/test/config")
    public String test() {
        return str;
    }
}
