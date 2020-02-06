package com.yxm.alibaba.seatabizservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
public class BizService {
    @Autowired
    private RestTemplate restTemplate;

    @Transactional
    public void biz(){
        //order
        restTemplate.getForObject("http://127.0.0.1:8020/order",String.class);
        //pay
        restTemplate.getForObject("http://127.0.0.1:8030/pay",String.class);
        int i = 1 / 0;
    }
}
