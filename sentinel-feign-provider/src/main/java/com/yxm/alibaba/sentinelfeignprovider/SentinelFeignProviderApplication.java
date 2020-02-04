package com.yxm.alibaba.sentinelfeignprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class SentinelFeignProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentinelFeignProviderApplication.class, args);
    }

}
