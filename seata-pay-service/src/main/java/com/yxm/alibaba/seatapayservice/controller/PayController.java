package com.yxm.alibaba.seatapayservice.controller;

import com.yxm.alibaba.seatapayservice.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {

    @Autowired
    private PayService payService;

    @GetMapping("/pay")
    public String pay(){
       payService.save();
       return "success";
    }
}
