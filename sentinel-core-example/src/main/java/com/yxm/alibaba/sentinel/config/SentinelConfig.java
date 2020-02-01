package com.yxm.alibaba.sentinel.config;

import com.alibaba.csp.sentinel.adapter.servlet.callback.WebCallbackManager;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class SentinelConfig {

    @PostConstruct
    public void innit(){
        WebCallbackManager.setUrlBlockHandler(new DemoUrlBlockHandler());
    }
}