package com.yxm.alibaba.sentinelfeignconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "sentinel-feign-provider",fallback =DemoFeignClientFallback.class)
public interface DemoFeginClient {

    @GetMapping("/feign")
    String feign();
}
