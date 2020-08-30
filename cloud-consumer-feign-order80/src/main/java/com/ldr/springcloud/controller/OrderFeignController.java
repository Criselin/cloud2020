package com.ldr.springcloud.controller;

import com.ldr.springcloud.entities.CommonResult;
import com.ldr.springcloud.entities.Payment;
import com.ldr.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by LD
 * 2020/8/27 22:20
 **/
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
     //openfeign-ribbon,客户端一般默认等待一秒钟
        return paymentFeignService.paymentFeignTimeout();
    }
}
