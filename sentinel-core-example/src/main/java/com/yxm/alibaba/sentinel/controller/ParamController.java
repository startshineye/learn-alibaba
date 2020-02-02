package com.yxm.alibaba.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.yxm.alibaba.sentinel.config.ExceptionUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParamController {

    @GetMapping("/param")
    @SentinelResource(value = "/param",blockHandler = "exHandler")
    public String param(String type){
        return "success";
    }
    public String exHandler(String type, BlockException blockHandler){
        /**
         * 热点限流:参数限流
         * 所以我们需要接受一个参数
         * 如果不指定blockHandlerClass默认会从本类去寻找处理类:exHandler
         */
        return "param request error";
    }
}
