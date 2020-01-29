package com.yxm.alibaba.nacosdiscoverygateway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class NacosDiscoveryGatewayApplication {
    public static void main(String[] args) {
        //com.yxm.alibaba.nacosdiscoverygateway.NacosDiscoveryGatewayApplication
        SpringApplication.run(NacosDiscoveryGatewayApplication.class, args);
    }
}
