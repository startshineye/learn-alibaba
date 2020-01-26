package com.yxm.alibaba.nacosdiscoveryconsumer.controller;

import com.netflix.loadbalancer.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.alibaba.nacos.ribbon.NacosServer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/test")
    public String test(String name){
     /*
       //1.原始设置
        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-discovery-provider");
        URI uri = serviceInstance.getUri();
        return restTemplate.getForObject(uri+"/hello?name="+name, String.class);

        //2.url固定设置
        return restTemplate.getForObject("http://nacos-discovery-provider/hello?name="+name, String.class);
        */
        //3.nacos设置
        RibbonLoadBalancerClient.RibbonServer ribbonServer = (RibbonLoadBalancerClient.RibbonServer) loadBalancerClient.choose("nacos-discovery-provider");
        NacosServer nacosServer = (NacosServer) ribbonServer.getServer();
        Map<String, String> metadata = nacosServer.getMetadata();
        System.out.println("--->"+metadata);
        URI uri = ribbonServer.getUri();
        return restTemplate.getForObject("http://nacos-discovery-provider/hello?name="+name, String.class);
    }
}
