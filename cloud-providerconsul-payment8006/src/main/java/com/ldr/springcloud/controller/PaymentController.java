package com.ldr.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by LD
 * 2020/8/27 11:12
 **/
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "payment/consul")
    public String paymentConsul(){
        return "springcloud with consul:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }

}
