package com.yxm.alibaba.seataordservice.controller;

import com.yxm.alibaba.seataordservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order")
    public String pay(){
        orderService.save();
        return "success";
    }
}
