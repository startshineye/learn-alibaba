package com.yxm.alibaba.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.yxm.alibaba.sentinel.config.ExceptionUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello(){
       return "Hello Sentinel";
    }

    @GetMapping("/resource")
    @SentinelResource(value = "/resource",blockHandler="exHandler",blockHandlerClass ={ExceptionUtil.class})
    public String resource(){
        return "Hello resource";
    }

    @GetMapping("/hello2")
    @SentinelResource(value = "hello2", blockHandler = "exHandler", blockHandlerClass = {ExceptionUtil.class})
    public String resource1() {
        return "hello resource1";
    }

    public String exHandler(BlockException blockHandler){
      return "exHandler error";
    }
}
