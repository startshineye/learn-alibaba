package com.yxm.alibaba.sentinelfeignconsumer.feign;

import org.springframework.stereotype.Component;

@Component
public class DemoFeignClientFallback implements DemoFeginClient {
    @Override
    public String feign() {
        return "error";
    }
}
