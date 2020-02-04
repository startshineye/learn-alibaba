package com.yxm.alibaba.sentinelfeignconsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringCloudApplication
public class SentinelFeignConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentinelFeignConsumerApplication.class, args);
    }

}
