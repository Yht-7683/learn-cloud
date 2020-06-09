package com.yht.cloud.nacos.controller;

import com.yht.cloud.nacos.service.imp.Paymentimp;
import com.yht.cloud.nacos.vo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PaymentController {
    @Autowired
    private Paymentimp paymentimp;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/nacos/{id}")
    public Payment getPayment(@PathVariable("id") Long id){

        return paymentimp.getPayment(id,serverPort);
    }
    @GetMapping("{id}")
    public Long get(@PathVariable("id")Long id){
        return id;
    }
    @PostMapping("/payment/nacos")
    public Payment getp(){
        return  paymentimp.getPayment((long)1,serverPort);
    }
}
